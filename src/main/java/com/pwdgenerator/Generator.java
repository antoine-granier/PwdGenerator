package com.pwdgenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generator {

    private boolean uppercase;
    private boolean lowercase;
    private boolean number;
    private boolean symbol;
    private int length;

    public Generator(boolean uppercase, boolean lowercase, boolean number, boolean symbol, int length) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.number = number;
        this.symbol = symbol;
        this.length = length;
    }

    public String generate() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        if (uppercase == false && lowercase == false && number == false && symbol == false) {
            return password.toString();
        }
        for(int i = 0; i < length; i++) {
            int r = random.nextInt(4);
            switch (r) {
                case 0:
                    if (uppercase == true) {
                        password.append(getRandomUpper());
                    } else {
                        i--;
                    }
                    break;
                case 1:
                    if (lowercase == true) {
                        password.append(getRandomLower());
                    } else {
                        i--;
                    }
                    break;
                case 2:
                    if (number == true) {
                        password.append(getRandomNumber());
                    } else {
                        i--;
                    }
                    break;
                case 3:
                    if (symbol == true) {
                        password.append(getRandomSymbol());
                    } else {
                        i--;
                    }
                    break;
            }
        }
        return password.toString();
    }

    public String getRandomUpper() {
        return Character.toString((char) Math.floor(Math.random() * 26) + 65);
    }

    public String getRandomLower() {
        return Character.toString((char) Math.floor(Math.random() * 26) + 97);
    }

    public int getRandomNumber() {
        return (int) Math.floor(Math.random() * 9);
    }

    public String getRandomSymbol() {
        String s = "!;@;#;$;%;^;&;*;(;);{;};[;];=;<;>;/;,;.";
        ArrayList<String> symbols = new ArrayList<String>(Arrays.asList(s.split(";")));
        return symbols.get((int) Math.floor(Math.random() * symbols.size()));
    }

    public boolean isUppercase() {
        return uppercase;
    }

    public boolean isLowercase() {
        return lowercase;
    }

    public boolean isNumber() {
        return number;
    }

    public boolean isSymbol() {
        return symbol;
    }
}
