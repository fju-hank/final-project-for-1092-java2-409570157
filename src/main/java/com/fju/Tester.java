package com.fju;

import java.io.*;

public class Tester {
    public static void main(String[] args) throws IOException {
        //Import the horse racing code, which is what I coded when the teacher was teaching.
        // Rewrite.
        Rabbit r1 = new Rabbit();
        Tortoise t1 = new Tortoise();
        r1.start();
        t1.run();


        //Add FileReader
        FileInputStream fis = new FileInputStream("File.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s;
        while((s = br.readLine())!= null) {
            System.out.println(s);
        }
            br.close();
            isr.close();
            fis.close();
        }
    }

