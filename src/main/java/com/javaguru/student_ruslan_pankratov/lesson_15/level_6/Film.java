package com.javaguru.student_ruslan_pankratov.lesson_15.level_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Film {

    private double likeSum; //полное количество оценки лайков
    private double middleLike;//среднее число лайков
    private String nameFilm;
    private double cost;
    private double minute;
    private double like;//количество лайков
    private List<Customer> listOfPeopleWhoLiked = new ArrayList<>();


    public Film(String nameFilm, double cost, double minute) {
        this.nameFilm = nameFilm;
        this.cost = cost;
        this.minute = minute;
    }


    public List<Customer> getListOfPeopleWhoLiked() {
        return listOfPeopleWhoLiked;
    }

    public void setListOfPeopleWhoLiked(List<Customer> listOfPeopleWhoLiked) {
        this.listOfPeopleWhoLiked = listOfPeopleWhoLiked;
    }

    public double getLikeSum() {
        return likeSum;
    }

    public void setLikeSum(double likeSum) {
        this.likeSum = likeSum;
    }

    public double getMiddleLike() {
        return middleLike;
    }

    public void setMiddleLike(double middleLike) {
        this.middleLike = middleLike;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public double getLike() {
        return like;
    }

    public void setLike(double like) {
        this.like = like;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Double.compare(film.getLikeSum(), getLikeSum()) == 0
                && Double.compare(film.getMiddleLike(), getMiddleLike()) == 0
                && Double.compare(film.getCost(), getCost()) == 0 && Double.compare(film.getMinute(), getMinute()) == 0
                && Objects.equals(getNameFilm(), film.getNameFilm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLikeSum(), getMiddleLike(), getNameFilm(), getCost(), getMinute());
    }

    @Override
    public String toString() {
        return "Film{" +
                "likeCount=" + likeSum +
                ", averageNumber=" + middleLike +
                ", nameFilm='" + nameFilm + '\'' +
                ", cost=" + cost +
                ", minute=" + minute +
                '}';
    }
}
