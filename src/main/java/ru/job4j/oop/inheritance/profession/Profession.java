package ru.job4j.oop.inheritance.profession;

public class Profession {
    private String name;
    private String surname;
    private String patronymic;
    private String education;
    private Short experience;

    public Profession(String name, String surname, String patronymic,
                      String education, Short experience) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.education = education;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEducation() {
        return education;
    }

    public Short getExperience() {
        return experience;
    }
}
