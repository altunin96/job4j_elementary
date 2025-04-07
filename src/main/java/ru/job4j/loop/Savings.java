package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total += annualDeposit;
            double interest = (total - annualDeposit) * percent / 100;
            total += interest;
            years++;
        } while (total < goal);
        return years;
    }
}