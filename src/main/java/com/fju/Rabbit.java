package com.fju;

public class Rabbit extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
            if (i ==999){
                System.out.println(getName()+" is Winner!");
            }
        }
    }
}
