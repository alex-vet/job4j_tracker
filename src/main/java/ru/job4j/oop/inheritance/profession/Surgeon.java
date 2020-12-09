package ru.job4j.oop.inheritance.profession;

public class Surgeon extends Doctor {
    private String lastOperation;

    public Surgeon(String name, String surname, String patronymic,
                   String education, Short experience, String anamnesis, String lastOperation) {
        super(name, surname, patronymic, education, experience, anamnesis);
        this.lastOperation = lastOperation;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void operation(String name, boolean result) {

    }
}
