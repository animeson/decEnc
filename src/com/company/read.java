package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {

    public static String line (String[] args) {
        String text = "";
        String result[] = input.number(args);
        if (result[2].equals("")) {
            text = result[4];
        }
        else {
            String pathToFile = result[2];
            File file = new File(pathToFile);

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    text = scanner.nextLine().replace("\"", "");

                }
            }
            catch (FileNotFoundException e) {
                System.out.println("No file found: " + pathToFile);
            }


        }
        return text;
    }
}
