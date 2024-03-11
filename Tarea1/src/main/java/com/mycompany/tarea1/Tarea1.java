package com.mycompany.tarea1;
import java.util.Scanner; //importamos scanner a nuestro codigo
public class Tarea1 { //inicio de nuestra clase 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//crea un objeto capaz de leer lo que el usuario indique. 
        System.out.println("Ingrese un numero");//imprime "Ingrese un numero" en la pantalla del usuario
        int total= scanner.nextInt();//lee un numero entero ingresado por el usuario
        operaciones numeros = new operaciones();//crea un objeto de la clase operaciones
        numeros.datos1(total);/*Manda a llamar datos1 de la clase operaciones poniendo asi el numero
        ingresado como un argumento*/ 
    }
}

