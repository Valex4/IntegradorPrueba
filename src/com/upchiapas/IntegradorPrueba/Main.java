package com.upchiapas.IntegradorPrueba;

import com.upchiapas.IntegradorPrueba.models.Actividad;
import com.upchiapas.IntegradorPrueba.models.Usuario;


import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }
    private static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        byte option;
        do {
            System.out.println("1. Agregar tareas");
            System.out.println("2. Visualizar tareas");
            System.out.println("3. Salir");
            option = scanner.nextByte();
            switch (option){
                case 1:
                    Usuario.llenarLista();
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    break;
            }
        }while (option != 3);
    }
    private static void printList(){
        Actividad actividad;
        Iterator<Actividad> iterator = Usuario.getListaActividades().iterator();
        System.out.println("\t   ACTIVIDADES PENDIENTES ");
        while (iterator.hasNext()){
            actividad = iterator.next();
            System.out.println("Actividad: "+actividad.getActivity());
            System.out.println("Lista: "+actividad.getType());
            System.out.println("-----------TIEMPO RESTANTE-----------");
            System.out.println("dia(s): "+Math.abs(actividad.getDay())+" mes(es): "+Math.abs(actividad.getMonth())+" año(s): "+Math.abs(actividad.getYear()));
            System.out.println("-------------------------------------\n");
        }
    }
}

