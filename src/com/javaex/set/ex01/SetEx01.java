package com.javaex.set.ex01;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) ((Math.random()*45) + 1);
            set.add(num);
        }

        for (int lottonum : set) {
            System.out.print(lottonum + "\t");
        }

    }
}
