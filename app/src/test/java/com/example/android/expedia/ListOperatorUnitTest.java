package com.example.android.expedia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


public class ListOperatorUnitTest {

    private ListOperator listOperator;

    @Before
    public void setup() {
        // Will execute each test case
        listOperator = new ListOperator();
    }


    @Test
    public void onSimpleList_shouldReturnSum() {
        List<Integer> result = listOperator.sumThirds(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(result, Arrays.asList(6, 9, 12, 15));
    }


    @Test
    public void onMinimalInput_shouldReturnSum() {
        List<Integer> result = listOperator.sumThirds(Arrays.asList(1, 2, 3));
        assertEquals(result, Arrays.asList(6));
    }

    @Test
    public void onListWithLengthLessThan2_shouldReturnEmptyList() {
        List<Integer> result = listOperator.sumThirds(Arrays.asList(1, 2));
        assertTrue(result.isEmpty());
    }

    @Test
    public void onNumber4_shouldReturnSum(){
        List<Integer> result = listOperator.sumNumbers(Arrays.asList(1, 2, 3, 4, 5, 6), 4);
        assertEquals(result, Arrays.asList(10, 14, 18));
    }

    @Test
    public void onNumber8length7_shouldReturnEmptyList() throws Exception {
        List<Integer> result = listOperator.sumNumbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 8);
        assertTrue(result.isEmpty());
    }

    @Test
    public void onSimpleList_shouldMultiply() throws Exception {
        List<Integer> result = listOperator.multiplyNumbers(Arrays.asList(1, 2, 3, 4), 3);
        assertEquals(result, Arrays.asList(6, 24));
    }

    // TODO: 8/1/2017 Empty list with length smaller than list
    // TODO: 8/1/2017 Big numbers test cases
    // TODO: 8/1/2017 Null list? test case
    // TODO: 8/1/2017 Too many numbers test case
    // TODO: 8/1/2017 Check with a different number
    // TODO: 8/1/2017 Check with a negative number
    // TODO: 8/1/2017 Check with a very big number

    @After
    public void tearDown() throws Exception {
        listOperator = null;
    }
}
