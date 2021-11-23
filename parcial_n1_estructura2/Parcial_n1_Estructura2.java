package parcial_n1_estructura2;

import Punto_1.Punto_n1;
import Punto_2.Punto_n2;
import java.util.Scanner;

/**
 *
 * @author Samir Vergara Vergara
 * @date 2021-09-13
 */
public class Parcial_n1_Estructura2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto_n1 p1 = new Punto_n1();                       
        Punto_n2 p2 = new Punto_n2();
        int opcion = 9999;
        do{
            System.out.println("------------------------Menu------------------------");            
            System.out.println("1. Desarrollar un método recursivo que transforme un número entero positivo a notación binaria.");
            System.out.println("2. Metodo recursivo que calcule el promedio de los numeros paraes positivos que estan en la Lista");                                  
            System.out.println("0. Salir");
            System.out.println("----------------------Fin Menu----------------------");
            opcion = sc.nextInt();             
            switch (opcion) {
                case 1:                    
                    try {
                        System.out.print("Ingrese un numero entero: ");
                        int n = sc.nextInt();                        
                        String res = (n>0)?p1.ConvertirNumeroaBinario(n):"Error, numero debe ser entero positivo!";
                        System.out.println("El numero  " + n +  "  expresado en binario es: " + res);                        
                    } catch (Exception e) {
                        System.out.println("***Error, Dato ingresado debe ser un Entero! Error: "+e);                        
                    }
                    break;
                case 2:
                    p2.EjecutarLista();
                    break;                                 
                case 0: break;                      
                default:
                System.out.println("***Opción Invalida***");                
            }
        }while(opcion!=0);
        System.out.println("***Fin Algoritmo***");                                                
    }
    
}
