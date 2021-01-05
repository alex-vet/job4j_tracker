package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.output.IOutput;

public class CreateAction implements IUserAction {
    private final IOutput out;

    public CreateAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
