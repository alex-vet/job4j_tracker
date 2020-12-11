package ru.job4j.oop.cast.vehicle;

public class VehicleUsage {
    public static void main(String[] args) {
        IVehicle bus = new Bus();
        IVehicle airplane = new Airplane();
        IVehicle train = new Train();

        IVehicle[] vehicles = new IVehicle[]{bus, airplane, train};
        for (IVehicle v : vehicles) {
            v.move();
        }
    }
}
