package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = false;
        status = 0;
        message = "Нет ошибки.";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public void printInfo() {
        System.out.println("Ошибка:" + active);
        System.out.println("Статус:" + status);
        System.out.println("Сообщение:" + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();

        Error errorTrue = new Error(true, 404, "Ошибка 404!");
        errorTrue.printInfo();
    }
}
