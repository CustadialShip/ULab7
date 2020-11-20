package com.bsu.by;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sortTestIncreasingByValue() {
        Sort st = new Sort(1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = Arrays.asList(2, 1, 5, 3, 4);
        st.run(actual);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void sortTestDecreasingByValue() {
        Sort st = new Sort(2);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> actual = Arrays.asList(2, 1, 5, 3, 4);
        st.run(actual);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void sortTestIncreasingByTheNumberOfDigits() {
        Sort st = new Sort(3);
        List<Integer> expected = Arrays.asList(5, 41, 311, 2111, 11111);
        List<Integer> actual = Arrays.asList(2111, 11111, 5, 311, 41);
        st.run(actual);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void sortTestDecreasingByTheNumberOfDigits() {
        Sort st = new Sort(4);
        List<Integer> expected = Arrays.asList(51111, 4111, 311, 21, 1);
        List<Integer> actual = Arrays.asList(21, 1, 51111, 311, 4111);
        st.run(actual);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}