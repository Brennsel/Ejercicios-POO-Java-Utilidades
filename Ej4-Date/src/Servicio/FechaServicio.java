/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
-a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
-b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
-c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario)
 */

package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {

    public static Date fechaNacimiento() {

        Scanner leer = new Scanner(System.in);
        int d, m, a;

        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia: ");
        d = leer.nextInt();

        System.out.print("Mes: ");
        m = leer.nextInt();

        System.out.print("Año: ");
        a = leer.nextInt();

        return new Date(a - 1900, m - 1, d);
    }

    public static Date fechaActual() {

        return new Date();
    }

    public static int diferencia() {

        Date act = fechaActual();
        Date nac = fechaNacimiento();

        int edad = act.getYear() - nac.getYear();

        if (nac.getMonth() > act.getMonth()) {

            edad--;

        } else if (nac.getMonth() == act.getMonth()) {
            if (nac.getDay() > act.getDay()) {
                edad--;
            }
        }
        return edad;
    }
}
