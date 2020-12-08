package ru.job4j.inheritance.report;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                "\tname : " + name + ","  + System.lineSeparator() +
                "\tbody : " + body +  System.lineSeparator() +
                "}";
    }
}