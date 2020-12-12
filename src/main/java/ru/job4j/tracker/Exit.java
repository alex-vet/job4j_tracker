package ru.job4j.tracker;

public class Exit implements IUserAction {
    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
