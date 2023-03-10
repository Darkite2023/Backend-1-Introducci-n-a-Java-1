/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosjavalibre;

import java.util.Scanner;

/**
 *
 * @author Polako
 */
public class EjerciciosJavaLibre {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    if (num1 > 25 || num2 > 25){
        if(num1 > 25){
        System.out.println("El numero 1 es mayor a 25 y es  "+num1);
        }else if(num2<25){
        System.out.println("El numero 2 es mayor a 25 y es "+num2);
        }
        
    }else{
        System.out.println("Todos son menores a 25");
    }
    
    }
}
