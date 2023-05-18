package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i =0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
}
