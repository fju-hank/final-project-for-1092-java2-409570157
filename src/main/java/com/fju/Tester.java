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
        FileOutputStream fos= new FileOutputStream("File.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("File.txt"));
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        }}

