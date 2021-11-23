package Punto_1;

/**
 *
 * @author Samir Vergara Vergara
 * @date 2021-09-13
 */
public class Punto_n1 {
    /**
     * 
     * @param num
     * @return 
     */
    public String ConvertirNumeroaBinario(int num){ //Recibe el Numero entero que se convertira en Binario.
        int a = num;
        if (num / 2 != 1){ //Si el resultado (cociente) de Num/2 es diferente de 1, es decir, cualquier otro numero el va continuar ejecutandose de manera recursiva.
            /**
             * Si la condición se cumple, se ejecuta de manera recursiva nuevamente este función
             * y se le envia como parametro el numero dividido entre 2 + el modulo del mismo, es decir, cero (0)
             */            
             System.out.println(a+"/2 cociente "+(a / 2)+" y residuo "+(a % 2));
            return ConvertirNumeroaBinario(num / 2) + num % 2; 
        }else{  
            //Si la condicion no se cumple, es decir el resultado (cociente) de Num/2 es igual a 1 
            //el algoritmo retorma mod 2 del numero + 1 correspondiente al cociente final.                          
             System.out.println(a+"/2 cociente "+(a / 2)+" y residuo "+(a % 2));
            return "1" + num%2;
            //al final retorna un valor concatenando los resultados anteriores.
        }
    }    
}
