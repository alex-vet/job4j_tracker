package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        boolean run = true;
        System.out.println("Welcome to the game - 11");
        System.out.println("There are " + count + " matches on the table.");
        while (run) {
            int choice = getChoice("One", count);
            count = currCount(count, choice);
            run = checkWin(count, "One");
            if (run) {
                choice = getChoice("Two", count);
                count = currCount(count, choice);
                run = checkWin(count, "Two");
            }

        }
    }

    private static int getChoice(String player, int count) {
        int currChoice = 0;
        boolean correct = false;
        Scanner input = new Scanner(System.in);
        while (!correct) {
            System.out.println("Player " + player + " should pick up from 1 to 3 matches");
            System.out.println("How many do you pick up?: ");
            currChoice = Integer.parseInt(input.nextLine());
            correct = currChoice > 0 && currChoice < 4 && currChoice <= count;
            if (!correct) {
                System.out.println("Wrong quantity! Try again!");
            }
        }
        return currChoice;
    }

    private static int currCount(int count, int choice) {
        int remain = count - choice;
        System.out.println("There are " + remain + " matches on the table.");
        return remain;
    }

    private static boolean checkWin(int count, String player) {
        if (count == 0) {
            System.out.println("The player " + player + " has won!");
            return false;
        }
        return true;
    }
}
