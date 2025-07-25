package ru.job4j.tracker;

public class User {
    private int id;

    private String username;

    private String password;

    @Override
    public String toString() {
        return "User "
                + "id=" + id
                + ", username=" + username
                + ", password=" + password;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}