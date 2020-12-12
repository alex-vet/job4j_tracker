package ru.job4j.tracker;

public class FindAllAction implements IUserAction {
    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item itm : items) {
            System.out.println(itm.toString());
        }
        return true;
    }
}
