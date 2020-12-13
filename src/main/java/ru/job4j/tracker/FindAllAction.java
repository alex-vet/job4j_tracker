package ru.job4j.tracker;

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
        Item[] items = tracker.findAll();
        for (Item itm : items) {
            out.println(itm.toString());
        }
        return true;
    }
}
