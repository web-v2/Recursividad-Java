package Punto_2;

/**
 *
 * @author Samir Vergara Vergara
 * @date 2021-09-13
 */
public class Nodo {
    private Object dato;
    private Nodo sig;
    // metodo que inicializa las varibles
    public Nodo(Object dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }
    public Nodo() {
        this.dato = null;
        this.sig = null;
    }
    //metodo que recibe la informacion de las variables
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    //metodo que envia la informacion de las variables
    public Object getDato() {
        return dato;
    }
    public Nodo getSig() {
        return sig;
    }
}
