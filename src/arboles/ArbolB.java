/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author Martin
 */
public class ArbolB {

    Nodo raiz;

    public ArbolB() {
        raiz = null;
    }

    public void agregarnodo(int ind, String d) {
        Nodo nuevo = new Nodo(ind, d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;
            while (true) {
                padre = auxiliar;
                if (ind < auxiliar.indice) {
                    auxiliar = auxiliar.nodoizquierdo;
                    if (auxiliar == null) {
                        padre.nodoizquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.nododerecho;
                    if (auxiliar == null) {
                        padre.nododerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    public boolean estaVacio(){
        return raiz==null;
    }
    public void inOrden(Nodo r){
        if(r!=null){
            inOrden(r.nodoizquierdo);
            System.out.println(r.indice);
            inOrden(r.nododerecho);
        }
        
    }
        public void preOrden(Nodo r){
        if(r!=null){
            System.out.println(r.indice);
            preOrden(r.nodoizquierdo);
            preOrden(r.nododerecho);
        }
        
    }
          public void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.nodoizquierdo);
            postOrden(r.nododerecho);
            System.out.println(r.indice);
           
            
        }
        
    }
}
