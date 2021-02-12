package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.output.IOutput;

import java.util.List;

public class FindAllAction implements IUserAction {
    private final IOutput out;

    public FindAllAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Show all Items ====");
        List<Item> items = tracker.findAll();
        for (Item itm : items) {
            out.println(itm.toString());
        }
        return true;
    }
}
