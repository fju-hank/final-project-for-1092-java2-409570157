package com.fju;

public class Rabbit extends Thread{
    @Override
    public void run() {
        setName("Rabbit");
        int sumdistance = -1;
        for (int i = 0; i < 1000; i++) {
            // Try to add the code for rabbit rest
                while(sumdistance<i){
                    try {
                        Thread.sleep((int) (Math.random() * 1000) + 500);
                        System.out.println("Rabbit took a rest.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
            System.out.println(  "Rabbit  ran " + i + "m");
            if (i ==999){
                System.out.println(getName()+" completed the task !");
            }
        }
    }
}}
