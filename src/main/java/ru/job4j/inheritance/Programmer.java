package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(String programLanguage, int experience, boolean degree) {
        super(degree, experience);
        this.programLanguage = programLanguage;
    }
}