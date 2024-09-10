package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        //obtencion de   datos 

       Scanner calcular = new Scanner(System.in);
       System.out.println("Ingrese el primer número: ");
       double numero1 = calcular.nextDouble();

       System.out.println("Ingrese el segundo número: ");
       double numero2 =  calcular.nextDouble();

       if (numero1 > numero2 ) {
        System.out.println("El numero1 es mayor que numero2 " );
        
       }
       else if (numero1 < numero2 ) {
        System.out.println("El numero2 es mayor que numero1 " );
        
       }
        if (numero1 >=0 && numero2 >=0 ) {
        System.out.println("Ambos numeros  son positivos" );
        
       }
        if (numero1 <=0 && numero2 <=0 ) {
        System.out.println("Ambos numeros  son negativos" );
        
       }
       if  (numero1 <=0 || numero2<=0 ) {
        System.out.println("Un numero  es negativo " );
        
       }

       System.out.println("Ingrese la operación a realizar (+, -, *, /, %: ");
       char operacion = calcular.next().charAt(0);

         
       double resultado1 = numero1 + numero2;
       double resultado2 = numero1 - numero2;
       double resultado3 = numero1 * numero2;
       double resultado4 = numero1 / numero2;
       double resultado5 = numero1 % numero2;

       int resultadoEntero1 =(int) resultado1;
       int resultadoEntero2 =(int)resultado2;
       int resultadoEntero3 =(int)resultado3;
       int resultadoEntero4=(int)resultado4;
       int resultadoEntero5 =(int)resultado5;

        //resultado  impar

       if ((resultadoEntero1 %2) != 0) {
        System.out.println("El resultado  es impar "  ) ;
        
       }

       else if ((resultadoEntero2 %2) != 0) {
        System.out.println("El resultado  es impar "  ) ;
       }
       else if ((resultadoEntero3 %2) != 0) {
        System.out.println("El resultado  es impar "  ) ;
        
       }
       else if ((resultadoEntero4 %2) != 0) {
        System.out.println("El resultado  es impar "  ) ;
        
       }
       else if ((resultadoEntero5 %2)!= 0) {
        System.out.println("El resultado  es impar "  ) ;}

        else {
            System.out.println("El resultado es par");
        }

        
       

       //Determinar operacion  y  resultado

       if (operacion == '+') {
        System.out.println("El resultado  es: " + resultadoEntero1 ) ;
        
       }

       else if (operacion == '-' ){
        System.out.println("El resultado  es: " + resultadoEntero2);
       }
       else if (operacion == '*') {
        System.out.println("El resultado  es: " + resultadoEntero3);
        
       }
       else if (operacion == '/') {
        System.out.println("El resultado  es: " + resultadoEntero4);
        
       }
       else if (operacion == '%') {
        System.out.println("El resultado  es: " + resultadoEntero5);}

      
                   
    }
 } 
