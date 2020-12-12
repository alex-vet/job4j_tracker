package ru.job4j.tracker;

public class StartUI {
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
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        IUserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new Exit()
        };
        new StartUI().init(input, tracker, actions);
    }
}
