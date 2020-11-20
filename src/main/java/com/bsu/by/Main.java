package com.bsu.by;

import java.util.ArrayList;
import java.util.List;

public class Main extends Thread {
    int dimension;
    int typeSort;

    Main(int dimension, int typeSort) {
        this.dimension = dimension;
        this.typeSort = typeSort;
    }

    @Override
    public void run() {
        System.out.println("thread main is running");
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            sequence.add((int) (Math.random() * 1000));
        }
        for (int i : sequence) {
            System.out.print(i + " ");
        }

        Sort st = new Sort(typeSort);
        st.run(sequence);
        System.out.println();
        for (int i : sequence) {
            System.out.print(i + " ");
        }
    }
}
