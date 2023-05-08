/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */

package Servicio;

import Entidad.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        String nombre;
        Date fecha;

        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        fecha = crearFecha();

        return new Persona(nombre, fecha);
    }

    public Date crearFecha() {

        int dia, mes, anio;

        System.out.println("Ingrese su fecha de nacimiento");

        System.out.print("Día: ");
        dia = leer.nextInt();

        System.out.print("Mes: ");
        mes = leer.nextInt();

        System.out.print("Año: ");
        anio = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public int calcularEdad(Persona pers) {

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - pers.getFechaDeNac().getYear();

        if (pers.getFechaDeNac().getMonth() > fechaActual.getMonth()) {

            edad--;

        } else if (pers.getFechaDeNac().getMonth() == fechaActual.getMonth()) {
            if (pers.getFechaDeNac().getDay() > fechaActual.getDay()) {
                edad--;
            }
        }
        return edad;
    }

    public boolean menorQue(Persona pers, int edad) {

        return calcularEdad(pers) < edad;
    }

    public void mostrarPersona(Persona p) {

        System.out.println(p.toString());
    }

}


