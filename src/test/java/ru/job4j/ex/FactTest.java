package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeNumber() {
        Fact fact = new Fact();
        fact.calc(-10);
    }

    @Test
    public void whenZero() {
        Fact fact = new Fact();
        int rsl = fact.calc(0);
        assertThat(rsl, is(1));
    }
}