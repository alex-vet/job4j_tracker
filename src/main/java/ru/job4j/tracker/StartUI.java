package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item itm = new Item(1, "test");
        Tracker trk = new Tracker();
        trk.add(itm);
        itm = trk.findById(1);
        System.out.println(itm);
    }
}
