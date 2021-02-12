package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.output.IOutput;

import java.util.List;

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
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item itm : items) {
                out.println(itm.toString());
            }
        } else {
            out.println("Items with name=" + name + " not found.");
        }
        return true;
    }
}
