package main.java;

public class BillsCounter {

    public void count(int bills, int coins) {
        int[] values = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int[] count = new int[values.length];
        int[] coinValues = {1, 2, 5, 10, 25, 50};
        int[] coinCount = new int[coinValues.length];
        int index = values.length - 1;
        int coinsIndex = coinValues.length - 1;

        while (index != -1) {
            count[index] = bills / values[index];
            bills = bills % values[index];
            index--;
        }
        while (coinsIndex != -1) {
            coinCount[coinsIndex] = coins / coinValues[coinsIndex];
            coins = coins % coinValues[coinsIndex];
            coinsIndex--;
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Coins of 0.0%d hrn. = %d pcs.\n", coinValues[i], coinCount[i]);
        }

        for (int i = 3; i < coinCount.length; i++) {
            System.out.printf("Coins of 0.%d hrn. = %d pcs.\n", coinValues[i], coinCount[i]);
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("Bills of %d hrn. = %d pcs.\n", values[i], count[i]);
        }
    }
}
