package com.kod.testing.collection;

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        OddNumbersExterminator nowy = new OddNumbersExterminator();
        System.out.println(nowy.exterminate(list));
        //nowy.exterminate(list);

    }
}
