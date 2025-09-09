package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //programa para crear un ciclo
        // y crear un menu de opciones
        Integer opcionSeleccionada=0;
        while (opcionSeleccionada !=5){
            System.out.println("Munu de opciones");
            System.out.println("***********");
            System.out.println("Digita 1 para sumar ➕");
            System.out.println("Digita 2 para restar ➖ ");
            System.out.println("Digita 3 para multiplicar ✖ ");
            System.out.println("Digita 4 para dividir ➗");
            System.out.println("Digita 5 para salir del programa ");
            Scanner leerTeclado = new Scanner(System.in);
            System.out.println("Selecine una opcion por favor😊");
            opcionSeleccionada=leerTeclado.nextInt();
        }
    }
}