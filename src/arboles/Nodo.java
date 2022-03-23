/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author Martin
 */
public class Nodo {

    int indice;
    String dato;
    Nodo nodoizquierdo;
    Nodo nododerecho;

    public Nodo(int ind, String d) {
        this.indice = ind;
        this.dato = d;
        this.nododerecho = null;
        this.nodoizquierdo = null;
    }

    public String toString() {
        return indice + "La info que tiene es" + dato;
    }
}
