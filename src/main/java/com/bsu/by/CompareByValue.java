package com.bsu.by;

import java.util.Comparator;

public class CompareByValue implements Comparator<Integer> {
    public int compare(Integer a1, Integer a2){
        return a1.compareTo(a2);
    }
}
