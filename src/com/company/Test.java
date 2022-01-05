package com.company;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Users\\Артур\\Desktop\\test\\test1.txt");
            OutputStream os = new FileOutputStream("C:\\Users\\Артур\\Desktop\\test\\test2.txt");
            InputStream is1 = new FileInputStream("C:\\Users\\Артур\\Desktop\\test\\test2.txt");
            int byte1 = is.read();
            os.write(byte1);
            int byte2 = is.read();
            os.flush();
//            os.write('B');
            System.out.println("" + (char)is1.read() + (char)is1.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
