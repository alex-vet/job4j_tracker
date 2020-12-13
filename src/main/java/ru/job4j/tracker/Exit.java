package ru.job4j.tracker;

public class Exit implements IUserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(IInput input, Tracker tracker) {
        return false;
    }
}
