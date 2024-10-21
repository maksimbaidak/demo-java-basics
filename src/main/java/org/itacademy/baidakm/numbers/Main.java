package org.itacademy.baidakm.numbers;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, String> digits = new HashMap<>();

    static {
        digits.put(1,"один");
        digits.put(2,"два");
        digits.put(3,"три");
        digits.put(4,"четыре");
        digits.put(5,"пять");
        digits.put(6,"шесть");
        digits.put(7,"семь");
        digits.put(8,"восемь");
        digits.put(9,"девять");
    }

    public static void main(String[] args) {
        System.out.println(voiceDigit(10));
    }

    public static String voiceDigit(Integer digit){
        return (digit > 0 & digit < 10) ? digits.get(digit) : "Введите цифру";
    }
}
