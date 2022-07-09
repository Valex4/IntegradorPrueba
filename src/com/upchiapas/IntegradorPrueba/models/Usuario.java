package com.upchiapas.IntegradorPrueba.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Actividad> listaActividades = new ArrayList<>();
    public static void llenarLista(){
        Scanner keyboard = new Scanner(System.in);
        int day,month, year;
        String activity;
        System.out.println("Ingrese su activada a realizar: ");
        activity = keyboard.nextLine();
        System.out.println("Ingrese el dia: ");
        day = validateDay(keyboard.nextInt());
        System.out.println(day);
        System.out.println("Ingrese el mes: ");
        month = validateMonth(keyboard.nextInt());
        System.out.println("Ingrese el año: ");
        year = validateYear(keyboard.nextInt());
        menu(day, month, year,activity);
        //LocalDate.now().getDayOfMonth(); --para el dia
        //LocalDate.now().getMonthValue() --Para el mes
        // LocalDate.now().getYear() -- Para el año
    }
    private static void menu(int day, int month, int year, String activity){
        int option;
        String type;
        System.out.println("--------Listas existentes--------");
        System.out.println("1. Trabajo");
        System.out.println("2. Escuela");
        System.out.println("3. Personal");
        System.out.println("4. Hogar");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion: ");
        option = keyboard.nextInt();
        switch (option){
            case 1:
                 type = "Trabajo";
                day = LocalDate.now().getDayOfMonth() - day;
                month = LocalDate.now().getMonthValue() - month;
                year = LocalDate.now().getYear() - year;
                Trabajo trabajo = new Trabajo(activity,day,month,year,type);
                listaActividades.add(trabajo);
                break;
            case 2:
                type = "Escuela";
                day = LocalDate.now().getDayOfMonth() - day;
                month = LocalDate.now().getMonthValue() - month;
                year = LocalDate.now().getYear() - year;
                Escuela escuela = new Escuela(activity, day, month,year,type);
                listaActividades.add(escuela);
                break;
            case 3:
                type = "Personal";
                day = LocalDate.now().getDayOfMonth() - day;
                month = LocalDate.now().getMonthValue() - month;
                year = LocalDate.now().getYear() - year;
                Personal personal = new Personal(activity, day,month,year,type);
                listaActividades.add(personal);
                break;
            case 4:
                type = "Hogar";
                day = LocalDate.now().getDayOfMonth() - day;
                month = LocalDate.now().getMonthValue() - month;
                year = LocalDate.now().getYear() - year;
              Hogar hogar = new Hogar(activity,day,month,year,type);
                listaActividades.add(hogar);
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    private static int validateDay(int day){
        Scanner keyboard = new Scanner(System.in);
        while (day <1 || day >31)
        {
            System.out.println("Ingrese el dia nuevamente: ");
            day = keyboard.nextInt();

        }
        return day;
    }
    private static int validateMonth(int month){
        while (month < 1 || month > 12){
            System.out.println("Ingrese el mes nuevamente: ");
            month = keyboard.nextInt();
        }
        return month;
    }
    private static int validateYear(int year){
        while ( year < 2022){
            System.out.println("El año tiene que ser el mismo o mayor al actual");
            System.out.println("Ingrese el año nuevamente: ");
            year = keyboard.nextInt();
        }
        return year;
    }

    public static ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public static void setListaActividades(ArrayList<Actividad> listaActividades) {
        Usuario.listaActividades = listaActividades;
    }
}
