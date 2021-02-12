package ru.job4j.tracker;

import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.IInput;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.IOutput;
import ru.job4j.tracker.useraction.*;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final IOutput out;

    public StartUI(IOutput out) {
        this.out = out;
    }

    public void init(IInput input, Tracker tracker, List<IUserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            IUserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<IUserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        IOutput output = new ConsoleOutput();
        IInput input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<IUserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new FindAllAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new DeleteAction(output));
        actions.add(new FindByIdAction(output));
        actions.add(new FindByNameAction(output));
        actions.add(new Exit());
        new StartUI(output).init(input, tracker, actions);
    }
}
