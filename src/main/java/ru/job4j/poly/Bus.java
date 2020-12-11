package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Start to go");
    }

    @Override
    public void passenger(int countPassengers) {
        if (countPassengers == 0) {
            System.out.println("Need more passengers!");
        }
    }

    @Override
    public double refuel(int countFuel) {
        double price = 49.57;
        return countFuel * price;
    }
}
