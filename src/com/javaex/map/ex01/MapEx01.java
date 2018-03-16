package com.javaex.map.ex01;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
    public static void main(String[] args) {
        Map<String, Point> map = new HashMap<>();

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);
        Point p4 = new Point(4,4);

        map.put("권상우", p1);
        map.put("이정재", p2);
        map.put("정우성", p3);
        map.put("이효리", p4);

        System.out.println(map.get("권상우"));
        System.out.println(map.size());

        map.put("권상우", p4);
        System.out.println(map.get("권상우"));
        System.out.println(map.size());

    }
}
