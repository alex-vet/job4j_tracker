package ru.job4j.oop.cast.vehicle;

public class Train implements IVehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on rails.");
    }
}
