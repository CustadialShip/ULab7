package com.bsu.by;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort extends Thread {
    int typeSort;

    Sort(int typeSort) {
        this.typeSort = typeSort;
    }

    public void run(List<Integer> sequence) {
        switch (typeSort) {
            case 1 -> {
                Comparator cv = new CompareByValue();
                Collections.sort(sequence, cv);
            }
            case 2 -> {
                Comparator cv = new CompareByValue();
                List<Integer> sequenceCopy = new ArrayList<>(sequence);
                Collections.sort(sequenceCopy, cv);
                for (int i = 0; i < sequence.size(); i++) {
                    sequence.set(i, sequenceCopy.get(sequence.size() - i - 1));
                }
            }
            case 3 -> {
                Comparator cv = new ComparatorByDigits();
                Collections.sort(sequence, cv);
            }
            case 4 -> {
                Comparator cv = new ComparatorByDigits();
                List<Integer> sequenceCopy = new ArrayList<>(sequence);
                Collections.sort(sequenceCopy, cv);
                for (int i = 0; i < sequence.size(); i++) {
                    sequence.set(i, sequenceCopy.get(sequence.size() - i - 1));
                }
            }
        }
    }
}
