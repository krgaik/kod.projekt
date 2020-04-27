package com.kod.testing.collection;

import org.junit.*;
import com.kod.testing.collection.OddNumbersExterminator;
import org.w3c.dom.ls.LSOutput;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> numbersCheck1 = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        result = exterminator.exterminate(numbersCheck1);
        //Then
        Assert.assertEquals(new ArrayList<Integer>(),result);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> numbersCheck1 = new ArrayList<Integer>();
        numbersCheck1.add(2);
        numbersCheck1.add(1);
        numbersCheck1.add(135);
        numbersCheck1.add(200);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        result = exterminator.exterminate(numbersCheck1);
        ArrayList test = new ArrayList();
        test.add(2);
        test.add(200);
        Assert.assertEquals(test, result);


    }
}
