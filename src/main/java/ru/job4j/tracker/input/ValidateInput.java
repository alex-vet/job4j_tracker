package ru.job4j.tracker.input;

import ru.job4j.tracker.output.IOutput;

public class ValidateInput implements IInput {
    private final IOutput out;
    private final IInput in;

    public ValidateInput(IOutput out, IInput input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
