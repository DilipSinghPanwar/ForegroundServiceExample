package com.foregroundserviceexample;

public class Constants {

    public interface ACTION {

         String MAIN_ACTION = "com.action.main";
         String INIT_ACTION = "com.action.init";
         String PREV_ACTION = "com.action.prev";
         String PLAY_ACTION = "com.action.play";
         String NEXT_ACTION = "com.action.next";
         String STARTFOREGROUND_ACTION = "com.action.startforeground";
         String STOPFOREGROUND_ACTION = "com.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
         int FOREGROUND_SERVICE = 101;
    }
}