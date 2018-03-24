package com.avecherov;

public class Tens {
    public static void printTens() {
        String result = "";
        for (int i = 1; i < 100; i = i + 10) {
            for (int j = 0; j < 10; j++) {
                result += i + j + " ";
            }
            System.out.println(result.trim());
            result = "";
        }
    }
}