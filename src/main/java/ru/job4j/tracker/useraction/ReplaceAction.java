package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.output.IOutput;

public class ReplaceAction implements IUserAction {
    private final IOutput out;

    public ReplaceAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Edit Item ====");
        int id = input.askInt("Enter id Item for replace: ");
        String name = input.askStr("Enter name for new Item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item was replaced.");
        } else {
            out.println("Cannot replace Item.");
        }
        return true;
    }
}
