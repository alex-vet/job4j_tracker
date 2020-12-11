package ru.job4j.oop.cast.vehicle;

public class Airplane implements IVehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " fly.");
    }
}
