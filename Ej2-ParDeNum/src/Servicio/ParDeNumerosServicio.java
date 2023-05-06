/*
. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */

package Servicio;

import Entidad.ParDeNumeros;

public class ParDeNumerosServicio {

    public static void mostrarValores(){

        System.out.println("Numero 1: " +ParDeNumeros.getN1());
        System.out.println("Numero 2: " +ParDeNumeros.getN2());
    }

    public static double devolverMayor(){

        if(ParDeNumeros.getN1()>ParDeNumeros.getN2()){
            return ParDeNumeros.getN1();
        } else{
            return ParDeNumeros.getN2();
        }
    }

    public static Double devolverMenor(){

        if(ParDeNumeros.getN1()<ParDeNumeros.getN2()){
            return ParDeNumeros.getN1();
        } else{
            return ParDeNumeros.getN2();
        }
    }

    public static void calcularPotencia(){

        int potencia;

        potencia = (int) Math.pow(devolverMayor(),devolverMenor());

        System.out.println("La potencia del mayor valor de la clase elevado al menor número es: " +potencia);
    }

    public static void calcularRaiz(){

        double absoluto, raiz;

        absoluto = Math.abs(devolverMenor());
        raiz= Math.sqrt(absoluto);

        System.out.println("La raíz cuadrada del menor de los dos valores es : " +raiz);

    }


}


