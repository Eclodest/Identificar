

package com.mycompany.practica01;

import java.util.Scanner;

/**
 *
 * @author Eclo
 */
public class Practica01 {

    public static void main(String[] args) {
        Scanner pepito=new Scanner (System.in);
        int edad;
        double altura;
        double peso;
        double imc;
        String nombre;
        
        System.out.println("Formulario de Persona");
        System.out.println("=~=~=~=~=~=~=~=~=~=~=");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = pepito.nextLine();
        System.out.println("Edad: ");
        edad=pepito.nextInt();
        System.out.println("Altura: ");
        altura=pepito.nextDouble();
        System.out.println("Peso: ");
        peso=pepito.nextDouble();
        imc=peso/(altura * altura);
        System.out.println("IMC: "+ imc);
        System.out.println();
        System.out.println(nombre +" tiene "+ edad +" años, mide "+ altura +" metros, pesa unos "+ peso +" kg y su indice de masa corporal es de "+ imc +".");
    }
}
