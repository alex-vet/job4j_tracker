package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.input.StubInput;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.IOutput;
import ru.job4j.tracker.output.StubOutput;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenManyValidInput() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[] {"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(3));
    }

    @Test
    public void whenNegativeInput() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}