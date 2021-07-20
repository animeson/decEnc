package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String result[] = input.number(args);
        if (result[3].equals("")) {
            System.out.println(dec_and_enc.word(args));
        }
        else {
            File file = new File(result[3]);
            FileWriter writer = new FileWriter(file);
            writer.write(dec_and_enc.word(args));
            writer.close();

        }
    }
}