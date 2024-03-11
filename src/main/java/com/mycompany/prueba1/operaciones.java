/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

import java.util.Scanner;

/**
 *
 * @author PC15
 */
public class operaciones {
        public int suma ()
    {    
              Scanner sc= new Scanner(System.in);
              System.out.println("Ingrese nuemro 1(suma)");
              int num1=sc.nextInt();
              System.out.println("INgrese numero 2(suma)");
              int num2=sc.nextInt();
              return num1 + num2;
    }
        public int multiplicacion()
        {
              Scanner sc= new Scanner(System.in);
              System.out.println("Ingrese nuemro 1(multiplicacion)");
              int multi1=sc.nextInt();
              System.out.println("Ingrese numero 2(multiplicacion)");
              int multi2=sc.nextInt();
              return multi1 * multi2 ;
        }
     public int resta()
        {
              Scanner sc= new Scanner(System.in);
              System.out.println("Ingrese nuemro 1(Resta)");
              int resta1=sc.nextInt();
              System.out.println("Ingrese numero 2(Resta)");
              int resta2=sc.nextInt();
              return resta1 - resta2 ;
        }
         public int division ()
        {
              Scanner sc= new Scanner(System.in);
              System.out.println("Ingrese nuemro 1(Division)");
              int div1=sc.nextInt();
              System.out.println("Ingrese numero 2(Division)");
              int div2=sc.nextInt();
              return div1 / div2 ;
        }
         public int residuo ()
        {
              Scanner sc= new Scanner(System.in);
              System.out.println("Ingrese nuemro 1(Residuo)");
              int resu1=sc.nextInt();
              System.out.println("Ingrese numero 2(Residuo)");
              int resu2=sc.nextInt();
              return resu1%resu2 ;
        }         

    boolean residuo(int resultado, int resultado0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

