package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] result = input.number(args);
        File file = new File(result[3]);
        if (result[3].equals("")) {
            System.out.println(dec_and_enc.word(args));
        }
        else {
            FileWriter writer = new FileWriter(file);
            writer.write(dec_and_enc.word(args));
            writer.close();
        }

        if (!file.exists() && args.length == 0) {
            System.out.println("""
                    There is no data.
                    Create file or add data to args array
                    Goodbye
                    """);
        }
    }
}