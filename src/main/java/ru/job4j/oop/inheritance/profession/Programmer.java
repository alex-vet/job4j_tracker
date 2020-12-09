package ru.job4j.oop.inheritance.profession;

public class Programmer extends Engineer {
    private int countBugs;

    public Programmer(String name, String surname, String patronymic, String education, Short experience, String report, int countBugs) {
        super(name, surname, patronymic, education, experience, report);
        this.countBugs = countBugs;
    }

    public int getCountBugs() {
        return countBugs;
    }

    public void currentProgram(int countBugs) {

    }
}
