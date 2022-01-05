package com.company;

import java.io.*;

class Test2 {

    public static void main(String[] args) {
        try {
            Writer writer = new PrintWriter(System.out);
            writer.write(65);
            writer.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}