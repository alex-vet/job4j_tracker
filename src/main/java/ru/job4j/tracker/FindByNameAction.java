package ru.job4j.tracker;

public class FindByNameAction implements IUserAction {
    @Override
    public String name() {
        return "=== Find Items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item itm : items) {
                System.out.println(itm.toString());
            }
            return true;
        } else {
            System.out.println("Items with name=" + name + " not found.");
            return false;
        }
    }
}
