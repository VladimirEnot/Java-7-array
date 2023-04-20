package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;

    }

    public long avarage(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;

    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }
        }
        return monthMinimum + 1;
    }

    public int calcMonthSaleBellowAverage(long[] sales) {
        long avarageSale = avarage(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int calcMonthSaleAboveAverage(long[] sales) {
        long avarageSale = avarage(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > avarageSale) {
                counter++;

            }
        }
        return counter;


    }
}
