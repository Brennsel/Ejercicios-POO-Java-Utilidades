/*
-Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
2
● -Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● -Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
 */

package Servicio;

import Entidad.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado juego = new Ahorcado();

    public void crearJuego() {

        System.out.print("Ingrese la palabra: ");
        String palabra = leer.next();

        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            letras[i] = palabra.charAt(i);
        }

        System.out.print("Ingrese la cantidad de jugadas maximas:  ");
        int max = leer.nextInt();

        juego.setPalabra(letras);
        juego.setCantJugadasMax(max);
    }

    public void longitud() {

        System.out.println("La longitud de la palabra es: " + juego.getPalabra().length);
    }

    public boolean buscar(char letra) {

        char[] palabraAux = juego.getPalabra();

        for (int i = 0; i < juego.getPalabra().length; i++) {

            if (palabraAux[i] == letra) {

                return true;
            }
        }

        return false;
    }

    public void encontradas(char letra) {

        int cantEncontradas = 0;
        char[] palabraAux = juego.getPalabra();

        if (buscar(letra)) {

            System.out.println("La letra se encuentra en la palabra.");

            for (int i = 0; i < juego.getPalabra().length; i++) {

                if (palabraAux[i] == letra) {
                    cantEncontradas++;
                }
            }
        } else {

            System.out.println("La letra NO se encuentra en la palabra.");

            juego.setCantJugadasMax(juego.getCantJugadasMax() - 1);
        }

        juego.setCantLetrasEncontradas(juego.getCantLetrasEncontradas() + cantEncontradas);

        System.out.println("Han sido encontradas: " + juego.getCantLetrasEncontradas());
        System.out.println("Faltan encontrar: " + (juego.getPalabra().length - juego.getCantLetrasEncontradas()));
    }

    public void intentos() {

        System.out.println("Le quedan " + juego.getCantJugadasMax() + " intentos.");
    }

    public void juego() {

        crearJuego();
        longitud();

        do {
            System.out.println("============================================");
            System.out.print("\nIngrese una letra a buscar: ");
            char letra = leer.next().charAt(0);

            buscar(letra);
            encontradas(letra);
            intentos();

            if (juego.getCantJugadasMax() == 0) {
                System.out.println("Perdiste! Se acabaron los intentos.");

            } else if (juego.getCantLetrasEncontradas() == juego.getPalabra().length) {
                System.out.println("Ganaste! Palabra descubierta.");
            }

        } while (juego.getCantJugadasMax() != 0 && juego.getCantLetrasEncontradas() != juego.getPalabra().length);

    }
}
