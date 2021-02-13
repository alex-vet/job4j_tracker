package ru.job4j.ooa;

public class AirPort {
    public static void main(String[] args) {
        final AirBus AIRBUS = new AirBus("A320");
        System.out.println(AIRBUS);
        AIRBUS.printModel();
        AIRBUS.printCountEngine();
        AIRBUS.setName("A380");
        System.out.println(AIRBUS);
        AIRBUS.printModel();
        AIRBUS.printCountEngine();
    }
}
