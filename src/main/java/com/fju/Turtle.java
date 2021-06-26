package com.fju;

public class Turtle implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println( "Turtle ran " + i +"m");
            if (i ==999){
                System.out.println("Turtle completed the task!");
            }
        }
    }
}
