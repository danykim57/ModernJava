package com.example.modernjava.binding;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainFunc {
    public static boolean isPrime(int num) {
        String s = "";
        for (int i = 0; i < num; i++) {
            s.concat("1");
        }
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("/^1?$|^(11+?)\\1+$/");
        return matcher.matches();
    }
    public static void main(String[] args) {
//        Shape shape = new Rectangle(1, 2, 3, 4);
//        shape.draw();
        //Catamaran
        String pet = "Cat";
        StringBuilder sb = new StringBuilder(pet);
        sb.append("amaran");
        String boat = sb.toString();
        System.out.println(boat);
    }
}
