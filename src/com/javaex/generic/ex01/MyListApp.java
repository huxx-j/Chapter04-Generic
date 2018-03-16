package com.javaex.generic.ex01;

public class MyListApp {
    public static void main(String[] args) {
        MyList<Circle> myList = new MyList<>(); // Object를 쓰면 오만가지를 다 넣을 수 있는데 특정 객체만 넣고 싶을땐 제네릭을 쓴다.

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(6);

        Point p1 = new Point(2,2);
        Point p2 = new Point(3,3);
        Point p3 = new Point(5,5);



        myList.add(c1);
        myList.add(c2);
        myList.add(c3);

        MyList<Point> myList2 = new MyList<>();

        myList2.add(p1);
        myList2.add(p2);
        myList2.add(p3);

        System.out.println(myList.size());
    }
}
