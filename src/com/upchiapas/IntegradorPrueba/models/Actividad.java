package com.upchiapas.IntegradorPrueba.models;

import java.util.Scanner;

public class Actividad {
    protected String activity;
    protected int day;
    protected int month;
    protected  int year;
    protected String type;


    public Actividad(String activity, int day, int month, int year, String type) {
        this.activity = activity;
        this.day = day;
        this.month = month;
        this.year = year;
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
