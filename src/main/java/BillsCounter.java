package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BillsCounter {

    public void count(int bills) {
        System.out.print("Amount of money is: " + bills + " hrn. \nIt consist of: ");
        ArrayList<Integer> values = new ArrayList(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500));
        ArrayList<Integer> count = new ArrayList<>(Collections.nCopies(values.size(),0));

        int index = count.size() - 1;

        while (index != -1) {
            count.set(index, bills / values.get(index));
            bills = bills % values.get(index);
            index--;
        }
        for (int i = count.size() - 1; i >= 0; i--) {
            if (count.get(i) != 0)
                System.out.printf("Bill %d₴ * %d, ", values.get(i), count.get(i));
        }
    }
}
