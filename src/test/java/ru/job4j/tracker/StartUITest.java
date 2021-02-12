package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.input.StubInput;
import ru.job4j.tracker.output.IOutput;
import ru.job4j.tracker.output.StubOutput;
import ru.job4j.tracker.useraction.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        IOutput out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        IInput in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        IOutput out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        IInput in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new FindAllAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all Items ====" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new FindByIdAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Item by Id ====" + System.lineSeparator()
                        + "Item with id=1 not found." + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"0", "name", "1"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new FindByNameAction(out));
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Items by Name ====" + System.lineSeparator()
                        + "Items with name=name not found." + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        IOutput out = new StubOutput();
        IInput in = new StubInput(
                new String[]{"1", "0"}
        );
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}