package com.javaguru.student_ruslan_pankratov.lesson_15.level_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private double amountOfMoney;
    private String login;
    private String password;
    private List<Film> filmsCustomer = new ArrayList<>();//лист всегда должен содержать в себе сразу ню, иначе будет ошибка
    private boolean entranceAccount;

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void toDeposit(String inputLogin, String inputPassword, double depositAmount) {
        if (inputLogin.equals(login) && inputPassword.equals(password)) {
            amountOfMoney = amountOfMoney + depositAmount;//положить деньги пароль
        } else {
            System.out.println("Неправельный логин или пароль");
        }
    }

    public void withdraw(String inputLogin, String inputPassword, double moneyWithdrawn) {
        if (inputLogin.equals(login) && inputPassword.equals(password)) {
            amountOfMoney = amountOfMoney - moneyWithdrawn;//снять деньги пароль
        } else {
            System.out.println("Неправельный логин или пароль");
        }
    }

    void signInToAccount(String inputLogin, String inputPassword) {
        if (inputLogin.equals(login) && inputPassword.equals(password)) {
            entranceAccount = true;//зайти на аккаунт
        } else {
            System.out.println("не правильный логин или пароль");
        }
    }

    void logOut() {//выйти с аккаунта
        entranceAccount = false;
    }

    void buyAMovie(List<Film> films, String name) throws Exception {//купить фильм


        if (entranceAccount) {
            Film film = films.stream()
                    .filter(film1 -> film1.getNameFilm().equalsIgnoreCase(name))
                    .findAny()
                    .orElseThrow(Exception::new);
            if (film.getCost() <= amountOfMoney && film != null) {
                amountOfMoney = amountOfMoney - film.getCost();
                filmsCustomer.add(film);
            } else {
                System.out.println("Недостаточно денег на счету");
            }
        } else {
            System.out.println("Зайдите пожалуйста в ваш аккаунт");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.amountOfMoney, amountOfMoney) == 0 && entranceAccount == customer.entranceAccount && Objects.equals(getLogin(), customer.getLogin()) && Objects.equals(password, customer.password) && Objects.equals(filmsCustomer, customer.filmsCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfMoney, getLogin(), password, filmsCustomer, entranceAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "amountOfMoney=" + amountOfMoney +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", filmsCustomer=" + filmsCustomer +
                ", entranceAccount=" + entranceAccount +
                '}';
    }

//Главная часть программы, которая делает вычисления находится
    //в класе Customer в методе statement().
    // statement()

    //цель, добавлять фильмы, позволять делать оценки от посетителей
}
