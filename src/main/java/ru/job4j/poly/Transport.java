package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int countPassengers);

    double refuel(int countFuel);
}
