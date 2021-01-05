package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;

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
