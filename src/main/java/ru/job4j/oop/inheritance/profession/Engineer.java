package ru.job4j.oop.inheritance.profession;

public class Engineer extends Profession {
    private String report;

    public Engineer(String name, String surname, String patronymic,
                    String education, Short experience, String report) {
        super(name, surname, patronymic, education, experience);
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void writeReport(String someData) {

    }
}
