package ru.job4j.tracker;

public class FindByNameAction implements IUserAction {
    private final IOutput out;

    public FindByNameAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Items by name";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Find Items by Name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item itm : items) {
                out.println(itm.toString());
            }
        } else {
            out.println("Items with name=" + name + " not found.");
        }
        return true;
    }
}
