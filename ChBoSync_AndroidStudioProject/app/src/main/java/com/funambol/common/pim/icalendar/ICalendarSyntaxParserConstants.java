/* Generated By:JavaCC: Do not edit this line. ICalendarSyntaxParserConstants.java */
package com.funambol.common.pim.icalendar;

public interface ICalendarSyntaxParserConstants {

  int EOF = 0;
  int BEGIN_VCAL_T = 1;
  int BEGIN_VEVENT_T = 2;
  int BEGIN_VTODO_T = 3;
  int END_VCAL_T = 4;
  int END_VEVENT_T = 5;
  int END_VTODO_T = 6;
  int BEGIN_VTIMEZONE_T = 7;
  int BEGIN_STANDARDC_T = 8;
  int BEGIN_DAYLIGHTC_T = 9;
  int END_VTIMEZONE_T = 10;
  int END_STANDARDC_T = 11;
  int END_DAYLIGHTC_T = 12;
  int BEGIN_VALARM_T = 13;
  int END_VALARM_T = 14;
  int WS_T = 15;
  int CRLF_T = 16;
  int AALARM_T = 17;
  int DALARM_T = 18;
  int MALARM_T = 19;
  int PALARM_T = 20;
  int EXCEPTION_PARAMETER_T = 21;
  int EXCEPTION_PARAMETER_VALUE_T = 22;
  int EXCEPTION_COLON_T = 23;
  int EXCEPTION_SEMI_T = 24;
  int EXCEPTION_VALUE_PART_T = 25;
  int EXCEPTION_LINEFOLD_T = 26;
  int SEMICOLON_T = 27;
  int EQUALS_T = 28;
  int PARAMETER_T = 29;
  int QP_PARAMETER_T = 30;
  int PARAM_LINEFOLD_T = 31;
  int IDENTIFIER_T = 32;
  int COLON_T = 33;
  int COLON_T_QP = 34;
  int PROP_VALUE_T = 35;
  int PROP_LINEFOLD_T = 36;
  int PROP_VALUE_T_QP = 37;
  int PROP_EXCEPTIONS_T_QP = 38;
  int PROP_LINEFOLD_T_QP = 39;
  int PROP_EXCEPTIONS_SPLIT_T_1_QP = 40;
  int PROP_EXCEPTIONS_SPLIT_T_2_QP = 41;

  int DEFAULT = 0;
  int PROP_VALUE_STATE_QP = 1;
  int PROP_VALUE_STATE = 2;
  int PARAMLIST_WITH_QP_STATE = 3;
  int PARAMLIST_STATE = 4;
  int EXCEPTION_PROP_STATE = 5;
  int EXCEPTION_PARAM_STATE = 6;

  String[] tokenImage = {
    "<EOF>",
    "\"BEGIN:VCALENDAR\"",
    "\"BEGIN:VEVENT\"",
    "\"BEGIN:VTODO\"",
    "\"END:VCALENDAR\"",
    "\"END:VEVENT\"",
    "\"END:VTODO\"",
    "\"BEGIN:VTIMEZONE\"",
    "\"BEGIN:STANDARD\"",
    "\"BEGIN:DAYLIGHT\"",
    "\"END:VTIMEZONE\"",
    "\"END:STANDARD\"",
    "\"END:DAYLIGHT\"",
    "\"BEGIN:VALARM\"",
    "\"END:VALARM\"",
    "<WS_T>",
    "<CRLF_T>",
    "\"AALARM\"",
    "\"DALARM\"",
    "\"MALARM\"",
    "\"PALARM\"",
    "<EXCEPTION_PARAMETER_T>",
    "<EXCEPTION_PARAMETER_VALUE_T>",
    "\":\"",
    "\";\"",
    "<EXCEPTION_VALUE_PART_T>",
    "<EXCEPTION_LINEFOLD_T>",
    "\";\"",
    "\"=\"",
    "<PARAMETER_T>",
    "<QP_PARAMETER_T>",
    "<PARAM_LINEFOLD_T>",
    "<IDENTIFIER_T>",
    "\":\"",
    "\":\"",
    "<PROP_VALUE_T>",
    "<PROP_LINEFOLD_T>",
    "<PROP_VALUE_T_QP>",
    "<PROP_EXCEPTIONS_T_QP>",
    "<PROP_LINEFOLD_T_QP>",
    "<PROP_EXCEPTIONS_SPLIT_T_1_QP>",
    "<PROP_EXCEPTIONS_SPLIT_T_2_QP>",
  };

}
