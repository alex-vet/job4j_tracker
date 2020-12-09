package ru.job4j.oop.inheritance.profession;

public class Doctor extends Profession {
    private String anamnesis;

    public Doctor(String name, String surname, String patronymic,
                  String education, Short experience, String anamnesis) {
        super(name, surname, patronymic, education, experience);
        this.anamnesis = anamnesis;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void collectAnamnesis(String patientStory) {

    }
}
