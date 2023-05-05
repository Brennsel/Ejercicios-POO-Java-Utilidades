/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */

package ArregloMain;

import Servicio.ArreglosServicio;

public class Main {
    public static void main(String[] args) {

        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        ArreglosServicio.inicializarA(vectorA);
        ArreglosServicio.mostrar(vectorA);
        ArreglosServicio.ordenar(vectorA);
        ArreglosServicio.inicializarB(vectorA, vectorB);
        ArreglosServicio.mostrar(vectorA);
        ArreglosServicio.mostrar(vectorB);
    }
}