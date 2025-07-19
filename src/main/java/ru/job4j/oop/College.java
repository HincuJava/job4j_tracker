package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        // Создаем объект Freshman
        Freshman freshman = new Freshman();

        // Вызываем методы Student
        freshman.music("College rocks!");
        freshman.sing();

        // Upcasting к Student (автоматически)
        Student student = freshman;
        student.music("Upcasted song"); // Можно вызывать методы Student
        // student.nervous(); // Ошибка - метод nervous() не доступен через тип Student

        // Upcasting к Object (автоматически)
        Object obj = freshman;
        // obj.music("..."); // Ошибка - методы Student не доступны через тип Object

        System.out.println("Приведение выполнено успешно");

        // Демонстрация downcasting (понижающего приведения)
        Object obj2 = new Freshman();
        if (obj2 instanceof Freshman) {
            Freshman freshmanBack = (Freshman) obj2; // Явное приведение
            freshmanBack.nervous(); // Теперь доступны все методы Freshman
        }
    }
}