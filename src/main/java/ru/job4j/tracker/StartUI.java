package ru.job4j.tracker;

public class StartUI {
    private final IOutput out;

    public StartUI(IOutput out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, IUserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            IUserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(IUserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        IOutput output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        IUserAction[] actions = {
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
