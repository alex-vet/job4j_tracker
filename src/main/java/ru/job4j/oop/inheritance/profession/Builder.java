package ru.job4j.oop.inheritance.profession;

public class Builder extends Engineer {
    private String currProjectName;

    public Builder(String name, String surname, String patronymic, String education,
                   Short experience, String report, String currProjectName) {
        super(name, surname, patronymic, education, experience, report);
        this.currProjectName = currProjectName;
    }

    public String getCurrProjectName() {
        return currProjectName;
    }

    public void newTask(String nameTask) {

    }
}
