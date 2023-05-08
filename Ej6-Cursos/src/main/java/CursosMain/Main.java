package CursosMain;

import Entidad.Curso;
import Servicio.CursoServicio;

public class Main {
    public static void main(String[] args) {

        CursoServicio cs = new CursoServicio();

        System.out.println("La ganacia semanal es: $" + cs.calcularGananciaSemanal());

    }
}