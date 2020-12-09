package ru.job4j.oop.inheritance.shop;

public class Shop {
    public static void main(String[] args) {
        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {
        if ("Oil".equals(name)) {
            return new Product(name, price);
        }
        return new Product(name, price);
    }
}