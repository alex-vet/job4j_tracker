package ru.job4j.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.setFio("Ivanov Valeriy Sergeevich");
        ivanov.setGroup("RD-101");
        ivanov.setAddmission(new Date());

        System.out.println("Student " + ivanov.getFio() + " entered college " + ivanov.getAddmission() + " in group - " + ivanov.getGroup());
    }
}
