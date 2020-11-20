package com.bsu.by;

import java.util.Comparator;

class ComparatorByDigits implements Comparator<Integer> {
    public int compare(Integer a1, Integer a2){
        Integer numOfDigits1 = a1.toString().length();
        Integer numOfDigits2 = a2.toString().length();;
        return numOfDigits1.compareTo(numOfDigits2);
    }
}
