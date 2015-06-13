/*
 * Funambol is a mobile platform developed by Funambol, Inc.
 * Copyright (C) 2010 Funambol, Inc.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY FUNAMBOL, FUNAMBOL DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT  OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Funambol, Inc. headquarters at 643 Bair Island Road, Suite
 * 305, Redwood City, CA 94063, USA, or at email address info@funambol.com.
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * "Powered by Funambol" logo. If the display of the logo is not reasonably
 * feasible for technical reasons, the Appropriate Legal Notices must display
 * the words "Powered by Funambol".
 */
package de.chbosync.android.syncmlclient;

import android.app.Application;


/**
 * This class is called as soon as the package starts,
 * so basic and global initialization calls are made
 * inside of it.
 */
public class App extends Application {
    
    private static   App instance = null;
    
    protected static AppInitializer appInitializer = null;

    private static final Object mSyncObject = new Object();

    //---------- Constructor
    public App() {
        super();
        // This is the first instruction of the app, so no fear that instance is
        // null in any other part of the application
        instance = this;
    }

    
    /**
     * Getter for singleton instance.
     */
    public static App i() {
        synchronized(mSyncObject) {
            if (null == instance) {
                instance = new App();
            }
        }
        return instance;
    }
    
    //---------- Public properties
    public AppInitializer getAppInitializer() {
        if(appInitializer == null) {
            setupEnvironment();
        }
        return appInitializer;
    }

    public void disposeAppInitializer() {
        appInitializer = null;
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        setupEnvironment();
    }

    /**
     * Setup the environment, visibility is public only because
     * it's called from test classes.
     */
    public void setupEnvironment() {
        //creates a single instance of AppInitializer class
        appInitializer = new AppInitializer(this);
        appInitializer.init();
    }
}
