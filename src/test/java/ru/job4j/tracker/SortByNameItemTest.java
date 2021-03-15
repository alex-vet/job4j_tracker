package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByNameItemTest {

    @Test
    public void whenSortByNameAsc() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        List<Item> items2 = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C")
        );
        Collections.sort(items, new SortByNameItem());
        Assert.assertEquals(items, items2);
    }

    @Test
    public void whenSortByNameDesc() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        List<Item> items2 = Arrays.asList(
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        Collections.sort(items, Collections.reverseOrder(new SortByNameItem()));
        Assert.assertEquals(items, items2);
    }
}