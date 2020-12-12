package ru.job4j.tracker;

public class FindByIdAction implements IUserAction {
    @Override
    public String name() {
        return "=== Find Item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item itm = tracker.findById(id);
        if (itm != null) {
            System.out.println(itm.toString());
            return true;
        } else {
            System.out.println("Item with id=" + id + " not found.");
            return false;
        }
    }
}
