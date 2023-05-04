/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */

package Entidad;

public class ParDeNumeros {

    private static double n1, n2;

    public ParDeNumeros() {
        n1 = Math.random() * 5;
        n2 = Math.random() * 5;
    }

    public static double getN1() {
        return n1;
    }

    public static void setN1(double n1) {
        ParDeNumeros.n1 = n1;
    }

    public static double getN2() {
        return n2;
    }

    public static void setN2(double n2) {
        ParDeNumeros.n2 = n2;
    }
}
