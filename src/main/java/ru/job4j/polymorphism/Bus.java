package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус двигается по маршруту.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе: " + count + " мест.");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("В автобус залито: " + fuel + " литров дизеля.");
        return fuel;
    }
}
