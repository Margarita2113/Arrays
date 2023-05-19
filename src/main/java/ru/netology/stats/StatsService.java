package ru.netology.stats;


public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumAllSales(int[] sales) {
        int sumAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumAllSales += sales[i];
        }
        return sumAllSales;
    }

    public int averageSales(int[] sales) {
        int averageSales = sumAllSales(sales) / sales.length;

        return averageSales;
    }

    public int belowAverageSales(int[] sales) {
        int belowAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                aboveAverageSales++;
            }
        }
        return aboveAverageSales;
    }
}
