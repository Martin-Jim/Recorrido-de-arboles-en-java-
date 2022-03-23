/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        int indice;
        String dato;
        ArbolB arbol = new ArbolB();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                    Elija una opcion:
                                                                    1.-Agregar un Nodo
                                                                    2.-Recorrido inOrden 
                                                                    3.-Recorrido preOrden
                                                                    4.-Recorrido postOrden 
                                                                    5.-Salir
                                                                    """,
                        "Programa que crea Árboles Binarios", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {

                    case 1:
                        indice = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el indice del nodo", "Agregando nodo", JOptionPane.QUESTION_MESSAGE));
                        dato = JOptionPane.showInputDialog(null, "Ingresa la informacion del nodo",
                                "Agregando nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarnodo(indice, dato);
                        break;

                    case 2:
                        if (!arbol.estaVacio()) {
                            arbol.inOrden(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol esta vacio",
                                    "¡Atencion!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (!arbol.estaVacio()) {
                            arbol.preOrden(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol esta vacio",
                                    "¡Atencion!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!arbol.estaVacio()) {
                            arbol.postOrden(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol esta vacio",
                                    "¡Atencion!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Finalizando aplicacion",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "¡Error!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 5);
    }

}
