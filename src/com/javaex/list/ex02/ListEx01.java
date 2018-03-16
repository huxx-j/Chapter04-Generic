package com.javaex.list.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx01 {
    public static void main(String[] args) {
        List<Point> list = new LinkedList<>(); // 리스트는 한개의 타입만 저장가능 //LinkedList와 ArrayList는 List라는 인터페이스를 구현한것이므로 메소드가 같음.
        // LinkedList와 ArrayList 변경의 편의를 위해 List<> list 이렇게 씀

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list.size());

        Point a = list.get(0); // 인덱스 0번의 toString이 출력됨
        System.out.println(a);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        for (Point pp : list) {  // list의 첫번째 데이터를 받아서 pp로 저장
            System.out.println(pp.toString());
        }
        System.out.println();
        list.remove(1);

        for (Point pp : list) {
            System.out.println(pp.toString());
        }

        System.out.println();
        list.add(1,p2); // 1번 인덱스에 p2 저장

        for (Point pp : list) {
            System.out.println(pp.toString());
        }

    }
}
