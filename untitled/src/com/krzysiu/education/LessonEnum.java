package com.krzysiu.education;

import java.sql.SQLOutput;

enum ColorOutside{
    RED,
    GREEN,
    BLUE;
}

enum TrafficSignal{
    RED("STOP"), GREEN("GO"), YELLOW("PREPARE");

    private String action;

    public String getAction(){
        return action;
    }

    private TrafficSignal(String action){
        this.action = action;
    }
}

public class LessonEnum {
    enum ColorInside{
        RED,
        GREEN,
        BLUE;
        public void customMethod(){
            System.out.println("Enumerates can have methods");
        }
    }
    public static void main(String[] args){
        ColorOutside c1 = ColorOutside.GREEN;
        ColorInside c2 = ColorInside.BLUE;
        System.out.println(c1);
        System.out.println(c2);

        ColorInside colorArray[] = ColorInside.values();
        for (ColorInside color : colorArray){
            System.out.println(color + " at index " + color.ordinal());
        }
        c2.customMethod();

        TrafficSignal [] signals = TrafficSignal.values();
        for(TrafficSignal signal : signals){
            System.out.println("Color: " + signal.name()
                    + " action: " + signal.getAction());
        }
    }

}
