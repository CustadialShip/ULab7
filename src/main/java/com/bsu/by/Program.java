package com.bsu.by;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("dimension?");
            int dim = sc.nextInt();
            System.out.println("1 - increasing by value");
            System.out.println("2 - decreasing by value");
            System.out.println("3 - increasing by the number of digits");
            System.out.println("4 - decreasing by the number of digits");
            int typeSort = sc.nextInt();

            Main th1 = new Main(dim, typeSort);
            th1.start();

        }
    }
}
