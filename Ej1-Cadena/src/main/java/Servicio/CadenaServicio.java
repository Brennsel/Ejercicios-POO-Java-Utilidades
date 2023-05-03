/*
 Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) 1 . Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) 2. Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) 3. Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) 4. Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) 5. Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) 6. Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) 7. Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
8. salir
 */

package Servicio;

import Entidad.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    Cadena texto = new Cadena("hola mundo");


    public void mostrarVocales() {

        int vocal = 0;

        for (int i = 0; i < texto.getLongitud(); i++) {

            switch (texto.getFrase().substring(i, i + 1)) {

                case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U":
                    vocal++;
                    break;

                default:
                    break;
            }
        }

        if (vocal > 1) {
            System.out.println("La frase posee " + vocal + " vocales.");
        } else if (vocal == 1) {
            System.out.println("La frase posee una sola vocal.");
        } else {
            System.out.println("La frase no posee vocales.");
        }

    }

    public void invertirFrase() {

        String fraseInv = "";

        for (int i = texto.getLongitud(); i > 0; i--) {

            fraseInv = fraseInv.concat(texto.getFrase().substring(i - 1, i));
        }

        System.out.println(fraseInv);
    }

    public void vecesRepetido(String letra) {

        int cant = 0;

        for (int i = 0; i < texto.getLongitud(); i++) {
            if (texto.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {

                cant++;
            }
        }

        if (cant > 1) {
            System.out.println("La cantidad de veces que se repite la letra " + letra + " en la frase es " + cant + " veces.");
        } else if (cant == 1) {
            System.out.println("La letra " + letra + " se encuentra una sola ves en la frase.");
        } else {
            System.out.println("La letra " + letra + " no se encuentra en la frase.");
        }

    }

    public void compararLongitud(String nuevaFrase) {

        if (texto.getLongitud() > nuevaFrase.length()) {
            System.out.println("La longitud de la primer frase (" + texto.getLongitud() + ") es mayor a la longitud de la segunda frase ingresada (" + nuevaFrase.length() + ")");
        } else if (texto.getLongitud() < nuevaFrase.length()) {
            System.out.println("La longitud de la primer frase (" + texto.getLongitud() + ") es menor a la longitud de la segunda frase ingresada (" + nuevaFrase.length() + ")");
        } else {
            System.out.println("La longitud de la primer frase es igual a la longitud de la segunda frase ingresada (" + nuevaFrase.length() + ")");
        }
    }

    public void unirFrases(String nuevaFrase){

        String primerTexto = texto.getFrase();

        primerTexto = primerTexto.concat(" ");

        System.out.println("La frase unida es: " + primerTexto.concat(nuevaFrase));

    }

    public void reemplazar(String caracter){

        String fraseNueva="";

        for(int i=0; i< texto.getLongitud(); i++){
            if(texto.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
                fraseNueva = fraseNueva.concat(caracter);
            }else{
                fraseNueva=fraseNueva.concat(texto.getFrase().substring(i, i+1));
            }
        }
        System.out.println("La frase con el caracter reemplazado es: " +fraseNueva);
    }

    public boolean contiene(String letra){

        return texto.getFrase().contains(letra);
    }
}
