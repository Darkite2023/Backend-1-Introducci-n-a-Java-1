/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavalibre;

import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class IntrJavaEj7 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una opcion");
    int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La Bomba es una Bomba de agua");
                break;
            case 2:
                System.out.println("La Bomba es una Bomba de gasolina");
                break;
            case 3:
                System.out.println("La Bomba es una Bomba de hormigon");
                break;
            case 4:
                System.out.println("La Bomba es una Bomba de pasta alimenticia");
                break;    
            default:
                System.out.println("Todas las opciones son erroneas");
        }
}
}