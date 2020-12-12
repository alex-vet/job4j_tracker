package ru.job4j.tracker;

public class ReplaceAction implements IUserAction {
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id Item for replace: ");
        String name = input.askStr("Enter name for new Item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was replaced.");
            return true;
        } else {
            System.out.println("Cannot replace Item.");
            return false;
        }
    }
}
