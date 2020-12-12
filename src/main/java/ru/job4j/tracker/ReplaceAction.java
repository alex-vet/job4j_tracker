package ru.job4j.tracker;

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
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ====");
        int id = input.askInt("Enter id Item for replace: ");
        String name = input.askStr("Enter name for new Item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item was replaced.");
            return true;
        } else {
            out.println("Cannot replace Item.");
            return false;
        }
    }
}
