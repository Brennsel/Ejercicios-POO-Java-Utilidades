/*
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */

package Servicio;

import Entidad.Curso;

import java.util.Scanner;

public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {

        String[] alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {

            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = leer.next();
        }

        return alumnos;
    }

    public Curso crearCurso() {

        String cursoNom, turno;
        int horasPorDia, horasPorSemana;
        double precio;
        String[] alumnos;

        System.out.print("Ingrese nombre del curso: ");
        cursoNom = leer.nextLine();

        System.out.print("Ingrese cantidad de horas por dia: ");
        horasPorDia = leer.nextInt();

        System.out.print("Ingrese cantidad de horas por semana: ");
        horasPorSemana = leer.nextInt();

        System.out.print("Ingrese turno: ");
        do {
            turno = leer.next();

            if (!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde")) {
                System.out.print(" Turno invalido. Ingrese nuevamente: ");
            }

        } while (!turno.equalsIgnoreCase("mañana") && !turno.equalsIgnoreCase("tarde"));

        System.out.print("Ingrese el precio por hora: ");
        precio = leer.nextDouble();

        System.out.print("Ingrese el nombre de los alumnos: \n");
        alumnos = cargarAlumnos();

        return new Curso(cursoNom, horasPorDia, horasPorSemana, turno, precio, alumnos);

    }

    public double calcularGananciaSemanal() {

        Curso c1 = crearCurso();
        return c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumnos().length * c1.getCantidadDiasPorSemana();
    }
}
