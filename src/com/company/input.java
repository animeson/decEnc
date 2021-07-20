package com.company;

public class input {

    public static String[] number(String[] args) {
        String kay = "";
        String mode = "";
        String in  = "";
        String out  = "";
        String data  = "";
        String alg = "";
        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("-key")) {
                kay = args[i + 1];
            }
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            }
            if (args[i].equals("-in")) {
                in = args[i + 1];
            }
            if (args[i].equals("-out")) {
                out = args[i + 1];
            }
            if (args[i].equals("-data")) {
                data = args[i + 1];
            }
            if (args[i].equals("-alg")) {
                alg = args[i + 1];
            }
        }
        return new String[] {kay, mode, in, out, data, alg};
    }

}
