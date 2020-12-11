package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
               StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemByID(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
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

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all Items ====");
        Item[] items = tracker.findAll();
        for (Item itm : items) {
            System.out.println(itm.toString());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        int id = input.askInt("Enter id Item for replace: ");
        String name = input.askStr("Enter name for new Item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was added.");
        } else {
            System.out.println("Cannot add Item.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        int id = input.askInt("Enter id Item for delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item was deleted.");
        } else {
            System.out.println("Cannot delete Item.");
        }
    }

    public static void findItemByID(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id ====");
        int id = input.askInt("Enter id: ");
        Item itm = tracker.findById(id);
        if (itm != null) {
            System.out.println(itm.toString());
        } else {
            System.out.println("Item with id=" + id + " not found.");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
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
    }
}
