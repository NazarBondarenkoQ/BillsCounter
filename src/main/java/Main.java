package main.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BillsCounter billsCounter = new BillsCounter();
        Random random = new Random();
        long start = System.currentTimeMillis();
        billsCounter.count(random.nextInt(35789 - 24565) + 24565);
        long finish = System.currentTimeMillis();
        System.out.println("\nProgram execution time: " + (finish - start) + " ms");
    }
}
