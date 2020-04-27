package com.kod.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(){
        /*numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);*/
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for(Integer nums : numbers){
            if(nums % 2==0){
                evenNumbers.add(nums);
            }
        }
        return evenNumbers;
    }
}
