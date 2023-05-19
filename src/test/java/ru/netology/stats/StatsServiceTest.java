package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);


        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 6;
        int actualMaxMonth = service.maxSales(sales);


        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumAllSales = 180;
        int actualSmAllSales = service.sumAllSales(sales);


        Assertions.assertEquals(expectedSumAllSales, actualSmAllSales);

    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 15;
        int actualAverageSales = service.averageSales(sales);


        Assertions.assertEquals(expectedAverageSales, actualAverageSales);

    }

    @Test
    public void shouldCalculateBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageSales = 5;
        int actualBelowAverageSales = service.belowAverageSales(sales);


        Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);

    }

    @Test
    public void shouldCalculateAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);

    }
}
