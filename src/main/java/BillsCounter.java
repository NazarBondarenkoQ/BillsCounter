package main.java;

public class BillsCounter {

    public void count(int amount) {
        int[] values = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int[] count = new int[values.length];
        int index = values.length - 1;

        while (index != -1) {
            count[index] = amount / values[index];
            amount = amount % values[index];
            index--;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.printf("Bills of %d hrn. = %d pcs.\n", values[i], count[i]);
        }
    }
}
