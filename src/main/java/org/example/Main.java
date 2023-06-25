package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.patronymic = "Иванов";
        post.name = "Иван";
        post.surname = "Иванович";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;
        post.passport = "4444 №444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
    }
}