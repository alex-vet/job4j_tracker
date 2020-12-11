package ru.job4j.oop.cast.vehicle;

public class Bus implements IVehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on the road.");
    }
}
