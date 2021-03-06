package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.output.IOutput;

public class DeleteAction implements IUserAction {
    private final IOutput out;

    public DeleteAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Delete Item ====");
        int id = input.askInt("Enter id Item for delete: ");
        if (tracker.delete(id)) {
            out.println("Item was deleted.");
        } else {
            out.println("Cannot delete Item.");
        }
        return true;
    }
}
