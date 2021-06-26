package com.fju;

public class Turtle implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("R" + " " + i);
            if (i ==999){
                System.out.println("Turtle"+" is Winner!");
            }
        }
    }
}
