package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ====");
                Item[] items = tracker.findAll();
                for (Item itm : items) {
                    System.out.println(itm.toString());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                int id = input.askInt("Enter id Item for replace: ");
                String name = input.askStr("Enter name for new Item: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item was added.");
                } else {
                    System.out.println("Cannot add Item.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                int id = input.askInt("Enter id Item for delete: ");
                if (tracker.delete(id)) {
                    System.out.println("Item was deleted.");
                } else {
                    System.out.println("Cannot delete Item.");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                int id = input.askInt("Enter id: ");
                Item itm = tracker.findById(id);
                if (itm != null) {
                    System.out.println(itm.toString());
                } else {
                    System.out.println("Item with id=" + id + " not found.");
                }
            } else if (select == 5) {
                System.out.println("=== Find Items by Name ====");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item itm : items) {
                        System.out.println(itm.toString());
                    }
                } else {
                    System.out.println("Items with name=" + name + " not found.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
