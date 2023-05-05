/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
-1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
-2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
-3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
-4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */

package Servicio;

import java.util.Arrays;

public class ArreglosServicio {

    public static void inicializarA(double[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random() * 10;
        }
    }

    public static void mostrar(double[] vector) {

        System.out.println(Arrays.toString(vector));
    }

    public static void ordenar(double[] vector) {

        double min, max;
        Arrays.sort(vector);

        for (int i = 0; i < (int) (vector.length / 2); i++) {
            min = vector[i];
            max = vector[(vector.length - 1) - i];

            vector[(vector.length - 1) - i] = min;
            vector[i] = max;
        }
    }

    public static void inicializarB(double[] vectorA, double[] vectorB) {

        for (int i = 0; i < 10; i++) {
            Arrays.fill(vectorB, i, i + 1, vectorA[i]);
        }

        Arrays.fill(vectorB, 10, 20, 0.5);
    }
}
