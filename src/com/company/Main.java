package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //String path = "C:\\Users\\Артур\\Desktop\\test";
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path + "\\joke.java");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello world!");

        File folder = new File(path);
        fileCreation(folder);
    }

    public static void fileCreation(File folder) throws Exception {
        for(File entry : folder.listFiles()) {
            if (entry.isDirectory()) {
                File file = new File(entry.getAbsolutePath() + "\\joke.java");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Hello world!");
                fileCreation(entry);
            }
        }
    }
}
