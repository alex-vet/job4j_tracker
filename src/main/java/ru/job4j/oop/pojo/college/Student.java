package ru.job4j.oop.pojo.college;

import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date addmission;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getAddmission() {
        return addmission;
    }

    public void setAddmission(Date addmission) {
        this.addmission = addmission;
    }
}
