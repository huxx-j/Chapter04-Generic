package com.javaex.generic.ex01;

//제네릭을 쓰면 인스턴스화 될때 T가 <> 안에 들어간 걸로 바뀜
public class MyList<T> {
    private T[] oArray;
    private int crtPos;

    public MyList() {
        this.oArray = (T[])new Object[3];
        this.crtPos = 0;
    }
    public int size() {
        return crtPos;
    }
    public void add(T o) {
        oArray[crtPos] = o;
        crtPos ++;
    }

}
