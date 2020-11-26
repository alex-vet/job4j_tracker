package ru.job4j.oop;

public class Battery {
    private int charge;

    public Battery(int energy) {
        this.charge = energy;
    }

    public void exchange(Battery another) {
        another.charge += this.charge;
        this.charge = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(30);
        Battery second = new Battery(10);
        System.out.println("first : " + first.charge + ". second : " + second.charge);
        first.exchange(second);
        System.out.println("first : " + first.charge + ". second : " + second.charge);

    }
}
