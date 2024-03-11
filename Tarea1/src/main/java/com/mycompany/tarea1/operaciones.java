package com.mycompany.tarea1;
import java.util.Scanner; //importamos scanner a nuestro codigo
public class operaciones { //declaramos la clase operaciones
    public void datos1(int dato){ //declaramos que la variable "dato" reciba solo numeros enteros
        Scanner scanner = new Scanner(System.in); //crea un objeto capaz de leer lo que el usuario indique. 
        int resultado = dato % 2;//calculamos el residuo de el dato ingresado por el usuario
        if (resultado == 0) { //si el resultado de dato dividido 2 es cero 
            System.out.println("Su numero es par");//Imprime Su numero es par
        } else { //si no es 0
            System.out.println("Su numero es impar");//imprima Su numero es impar
        }  
    }              
}