package ru.job4j.io;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.SortedMap;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракл. Что ты хочешь узнать, смертный?");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да.");
        }
        if (answer == 1) {
            System.out.println("Нет.");
        }
        if (answer == 2) {
            System.out.println("Может быть.");
        }
    }
}
