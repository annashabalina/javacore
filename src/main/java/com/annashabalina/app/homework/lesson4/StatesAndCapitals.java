package com.annashabalina.app.homework.lesson4;

/**
 * Created by Пользователь on 16.10.2016.
 */
public class StatesAndCapitals {
    private String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware",
                        "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
                        "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                        "Missouri","Montana","Nebraska","Nevada", "New Hampshire","New Jersey","New Mexico","New York",
                        "North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
                        "South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin",
                        "Wyoming"};
    private String[] capitals = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta",
                        "Honolulu","Boise","Springfield","Indianapolis", "Des Moines", "Topeka","Frankfort","Baton Rouge",
                        "Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln",
                        "Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City",
                        "Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City",
                        "Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
    private String yourCapital;

    public String findCapital(String state){
        //String yourCapital = null;
        for(int i=0;i<states.length;i++){
            if(states[i].equals(state)){
                yourCapital=capitals[i];
              // System.out.println("Capital of "+ state +" is " +yourCapital);
             //return yourCapital;
            }
        }
        System.out.println("Capital of "+ state +" is " +yourCapital);
        return yourCapital;
    }
}

