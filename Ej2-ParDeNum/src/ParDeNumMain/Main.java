package ParDeNumMain;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

public class Main {
    public static void main(String[] args) {

        ParDeNumeros n1 = new ParDeNumeros();

        ParDeNumerosServicio.mostrarValores();
        ParDeNumerosServicio.devolverMayor();
        ParDeNumerosServicio.devolverMenor();
        ParDeNumerosServicio.calcularPotencia();
        ParDeNumerosServicio.calcularRaiz();

    }
}