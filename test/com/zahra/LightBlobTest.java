package com.zahra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightBlobTest {

    LightBlob lightBlob;

    @Before
    public void needRunBeforeTest() {
        lightBlob = new LightBlob();
    }

    @Test
    public void test_ascending_numbers() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int result = lightBlob.lightBlob(input);
        assertEquals(result, 7);
    }

    @Test
    public void test_descending_numbers() {
        int[] input = new int[]{7,6,5,4,3,2,1};
        int result = lightBlob.lightBlob(input);
        assertEquals(result,1);
    }

    @Test
    public void test1_disordered_numbers(){
        int[] input = new int[]{4,6,1,3,5,2,7};
        int result = lightBlob.lightBlob(input);
        assertEquals(result,3);
    }

    @Test
    public void test2_disordered_number(){
        int[] input=new int[]{6,3,1,4,2,5,7};
        int result=lightBlob.lightBlob(input);
        assertEquals(result,4);
    }

    @Test
    public void test_empty_input(){
        int[] input = new int[]{};
        int result= lightBlob.lightBlob(input);
        assertEquals(result,0);
    }

    @Test
    public void test_one_item_input(){
        int[] input = new int[]{1};
        int result = lightBlob.lightBlob(input);
        assertEquals(result,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_incorrect_input(){
        int[] input = new int[]{5};
        lightBlob.lightBlob(input);
    }
}
