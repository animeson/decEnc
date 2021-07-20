package com.company;

public class dec_and_enc {
    public static String word(String[] args) {
        int kay;
        int word = 0;
        String alg = "";
        String new_word = "";
        String mode;
        int y = 0;
        String text = read.line(args);
        String result[] = input.number(args);
        if (result[0].equals("")){
            kay = 0;
        } else {
            kay = Integer.parseInt(result[0]);
        }
        if (result[1].equals("")){
            mode = "enc";
        }else {
            mode = result[1];
        }
        if (result[5].equals("")) {
            alg = "shift";
        }
        else {
            alg = result[5];
        }
        for (int i = 0; i < text.length(); i++) {



            switch (mode) {
                case "dec":
                    word = text.charAt(i) - kay;
                    if (alg.equals("shift")) {
                        if (text.charAt(i) == 32) {
                            y = 32;
                        }
                        if (text.charAt(i) == 33) {
                            y = 33;
                        }
                        if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                            y = (word - 122) % 26 + 122;

                        }
                        if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
                            y = (word + 65) % 26 + 65;
                        }
                        new_word += (char) word;
                    }
                    else if (alg.equals("unicode")) {
                        new_word += (char) word;
                    }

                    break;
                case "enc":
                    word = text.charAt(i) + kay;
                    if (alg.equals("shift")) {
                        if (text.charAt(i) == 32) {
                            y = 32;
                        }
                        if (text.charAt(i) == 33) {
                            y = 33;
                        }
                        if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                            y = (word - 97) % 26 + 97;
                        }
                        if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
                            y = (word + 65) % 26 + 65;
                        }
                        new_word += (char) y;
                    }
                    else if (alg.equals("unicode")) {
                        new_word += (char) word;
                    }


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + mode);
            }


        }



        return new_word;

    }

}
