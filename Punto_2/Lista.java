package Punto_2;

/**
 *
 * @author Samir Vergara Vergara
 * @date 2021-09-13
 */
public class Lista {
    private Nodo cabeza,fin;
    //metodo que inicializa las variables
    public Lista(Nodo cabeza, Nodo fin) {
        this.cabeza = cabeza;
        this.fin = fin;
    }
    public Lista() {
        this.cabeza = null;
        this.fin = null;
    }
    //los metodos que recibe el apuntador cadeza y final de la Lista 
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    //metodos que envian el apuntador cabeza y fin de la Lista
    public Nodo getCabeza() {
        return cabeza;
    }
    public Nodo getFin() {
        return fin;
    }
    //Metodo que adiciona un Nodo al final de la Lista
    public void adicionarFinal(Nodo n){
        if(cabeza == null){
            cabeza = n;
            fin = n;
        }else{
            fin.setSig(n);
            fin = n;
        }
    }
    /**
     * Ejecuta al metodo de tipo privado mostrarRecursivamente.
     */
    public void mostrarRecursivamente(){
        mostrarRecursivamente(cabeza);
    }
    /**
     * Metodo de tipo privado que nos muestra los valores de la Lista.
     * @param Nodo de inicio del recorrido. 
     */
    private void mostrarRecursivamente(Nodo actual){
        if(actual != null){
          System.out.println((int)actual.getDato());
          mostrarRecursivamente(actual.getSig());
        }
    }
    /**
     * Ejecuta al metodo de tipo privado promedioParesPositivos.
     */
    public void mostrarPromedioRecursivamenteParesPositivos(){
        System.out.println("El promedio de los numeros pares es: "+promedioParesPositivos(cabeza,0,0));        
    }
    /**
     * Metodo promedioParesPositivos, realiza el calculo del promedio de todos los numeros
     * pares positivos en la Lista.
     * @param Nodo inicial.
     * @param sum, variable acumulador de tipo entero.
     * @param i, variable contador de tipo entero.
     * @return nos retorna un dato de tipo Double correspondiente al promedio entre sum/i.
     */
    private double promedioParesPositivos(Nodo actual,int sum, int i){        
        if(actual != null){
          int n = (int)actual.getDato();
            if(n>0 && n%2==0){                   
                return promedioParesPositivos(actual.getSig(), sum+n, i+1);
            }else{
                return promedioParesPositivos(actual.getSig(), sum, i);  
            }              
          } 
        double prom = (double)sum/i;
        return prom;
    }    
}
