package NombreFechaMain;

import Entidad.Persona;
import Servicio.PersonaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        Scanner leer = new Scanner(System.in);

        System.out.println("Su edad es: " + ps.calcularEdad(p1));

        System.out.print("Ingrese la edad que desea comparar: ");
        int edad = leer.nextInt();

        if (ps.menorQue(p1, edad)) {
            System.out.println(p1.getNombre() + " tiene menor edad que la comparada");
        } else {
            System.out.println(p1.getNombre() + " tiene mayor edad que la comparada");
        }

        ps.mostrarPersona(p1);
    }
}