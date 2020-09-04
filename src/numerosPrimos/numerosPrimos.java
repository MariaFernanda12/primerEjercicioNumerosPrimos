/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosPrimos;

import java.util.Scanner;

/**
 *
 * @author Maria Fernanda Martínez
 * Ejercicio 1: Función que imprime los primero n números primos 
 */
public class numerosPrimos {
    public static void main(String[] args) {
        //Declaración variables:
        //variable para leer parametros de entrada
        Scanner lectura = new Scanner(System.in);
        //variable de entrada que referencia la cantidad de números primos a desarrollar
        int numeroDePrimos;
        //variables de control de ciclos para realizar los calculos necesarios 
        // contador: variable de control referente al número de veces que se ejecutará el ciclo, se inicia en dos de acuerdo a la definición de números primos
        // n: variable de operación inicia en 4 ya que se tiene claro que los dos primeros números primos son 2 y 3
        // numeroA: primer numero primo, variable de control 
        int numeroA;
        int numeroB=4;
        int contador=2;
        
        // variable de cadena para imrpimir los numeros primos requeridos
        String cadenaNumerosPrimos="";
        //Entrada de variables
        System.out.println("ingrese un numero");
        numeroDePrimos=lectura.nextInt();
        
        if(numeroDePrimos>2){ // El número de primos a imprimir debe ser mayor a 2 por la definición de los mismo
            cadenaNumerosPrimos="2 - 3"; // Inicio cadena de numeros primos de salida (seestablece 2 y 3)
            while(contador<numeroDePrimos){//primer ciclo para realizar la operación el número de veces que se solicita en los parametros de entrada
                numeroA=2;// se establece variable de control en 2 por ser el primer número primo
                while(numeroA<=numeroB){ //segundo ciclo que valida el cálculo para saber si un número es primo
                  
                    if(numeroA==numeroB){ //validación que de ser cierta el némero es primo
                        System.out.println("Entro primer if");
                    cadenaNumerosPrimos=cadenaNumerosPrimos+" - "+numeroB; // A la cadena antes establecida le agrega el número que resulto ser primo
                    contador=contador+1;// Incrementa el contador en 1 y termina el segundo ciclo para iniciar de nuevo el primero
                    }else{
                    if(numeroB % numeroA==0){//Valida el modulo entre dos números con el fin de  
                    numeroA=numeroB;
                    }
                    }
                    numeroA=numeroA+1;//Incremento variables de cálculo y control
                }
                numeroB=numeroB+1;//Incremento variables de cálculo y control
            }
            //Salida cadena de primos
           System.out.println(cadenaNumerosPrimos);
           //Excpciones que se pueden presentar
        }else{
            if(numeroDePrimos>0){
                System.out.println("Los dos primeros números primos son 2 y 3");
            }else{
            //Deben ser números positivos
            System.out.println("ingresa numeros positivos");
            }
        }        
        
        
    }
   
}


