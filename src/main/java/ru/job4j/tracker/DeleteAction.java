package ru.job4j.tracker;

public class DeleteAction implements IUserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id Item for delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item was deleted.");
            return true;
        } else {
            System.out.println("Cannot delete Item.");
            return false;
        }
    }
}
