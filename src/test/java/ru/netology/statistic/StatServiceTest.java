package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatService;

public class StatServiceTest {

    @Test
    public void testSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAvarage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avarage(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMonthMaximumSale() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaximumSale(sales);
        long expected = 8;


        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testMonthMinimumSale() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinimumSale(sales);
        long expected = 9;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testcalcMonthSaleBellowAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthSaleBellowAverage(sales);
        long expected = 5;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testcalcMonthSaleAboveAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthSaleAboveAverage(sales);
        long expected = 5;


        Assertions.assertEquals(actual, expected);
    }
}



