package ru.netology.stats;
public class StatService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }
    public long avarage(long[] sales){
        return  sum(sales)/12;
    }

    public int avgLess(long[] sales){
        long avg = avarage(sales);
        int count =0;
        for (long sale : sales) {
            if (sale <avg){
                count++;
            }
        }
        return count;
    }

}
