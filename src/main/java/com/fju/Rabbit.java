package com.fju;

public class Rabbit extends Thread{
    @Override
    public void run() {
        setName("Rabbit");
        for (int i = 0; i < 1000; i++) {
            System.out.println(  "Rabbit  ran " + i + "m");
            if (i ==999){
                System.out.println(getName()+" completed the task !");
            }
        }
    }
}
