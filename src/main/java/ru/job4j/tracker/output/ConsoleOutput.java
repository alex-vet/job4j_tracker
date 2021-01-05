package ru.job4j.tracker.output;

public class ConsoleOutput implements IOutput {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
