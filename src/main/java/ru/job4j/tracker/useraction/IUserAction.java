package ru.job4j.tracker.useraction;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.IInput;

public interface IUserAction {
    String name();

    boolean execute(IInput input, Tracker tracker);
}
