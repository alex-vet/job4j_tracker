package ru.job4j.tracker;

public interface IUserAction {
    String name();

    boolean execute(IInput input, Tracker tracker);
}
