package ru.job4j.pojo;

import java.sql.SQLOutput;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("V.N. Hincu");
        student.setStudyGroup("MN-242");
        student.setAgeOfEnter("2024");
        System.out.println(student.getFullName() + " - of group " + student.getStudyGroup()
                + " enter in university in - "
                + student.getAgeOfEnter());
    }
}
