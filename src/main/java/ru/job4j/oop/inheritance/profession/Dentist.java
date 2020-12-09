package ru.job4j.oop.inheritance.profession;

public class Dentist extends Doctor {
    private int countHealDent;

    public Dentist(String name, String surname, String patronymic, String education, Short experience, String anamnesis, int countHealDent) {
        super(name, surname, patronymic, education, experience, anamnesis);
        this.countHealDent = countHealDent;
    }

    public int getCountHealDent() {
        return countHealDent;
    }

    public void currentSession(int healedDent) {

    }
}
