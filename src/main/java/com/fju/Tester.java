package com.fju;

public class Tester {
    public static void main(String[] args) {
        //Import the horse racing code, which is what I coded when the teacher was teaching.
        // Rewrite.
        Horse h1 = new Horse();
            Horse h2 = new Horse();
            Horse2 h3 = new Horse2();
            Thread th = new Thread(h3);
            th.start();
            h2.start();
            h1.start();
        }}

