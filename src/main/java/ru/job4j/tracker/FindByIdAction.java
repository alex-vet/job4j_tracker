package ru.job4j.tracker;

public class FindByIdAction implements IUserAction {
    private final IOutput out;

    public FindByIdAction(IOutput out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by Id";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        out.println("=== Find Item by Id ====");
        int id = input.askInt("Enter id: ");
        Item itm = tracker.findById(id);
        if (itm != null) {
            out.println(itm.toString());
        } else {
            out.println("Item with id=" + id + " not found.");
        }
        return true;
    }
}
