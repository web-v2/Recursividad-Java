package Punto_2;

import java.util.Scanner;

/**
 *
 * @author Samir Vergara Vergara
 * @date 2021-09-13
 */
public class Punto_n2 {
    public void EjecutarLista(){
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        int opcion = 9999;
        
        do{
            System.out.println("*****************");
            System.out.println("1. Ingresar datos al final de la Lista");
            System.out.println("2. Imprimir Lista");
            System.out.println("3. Calcular el Promedio de los numeros pares positivos");
            System.out.println("0. Salir");
            System.out.println("*****************");
            System.out.println("Digite una opcion: ");            
            opcion = sc.nextInt();            
            switch (opcion) {
                case 1:
                    System.out.print("Digite un valor entero: ");
                    int dato = sc.nextInt();
                    Nodo n = new Nodo(); 
                    n.setDato(dato);
                    lista.adicionarFinal(n); 
                    
                    break;
                case 2:
                    System.out.println("********************");
                    lista.mostrarRecursivamente();
                    break;
                case 3:
                    lista.mostrarPromedioRecursivamenteParesPositivos();
                    break;                                
            }

        } while (opcion != 0);        
    }
}
