package CadenaMain;

import Servicio.CadenaServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        CadenaServicio cs = new CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        String letra, frase4;

        do {
            System.out.println("=============================================");
            System.out.println("====================MENU=====================");
            System.out.println("1. CANTIDAD DE VOCALES");
            System.out.println("2. INVERTIR FRASE");
            System.out.println("3. CANTIDAD DE VECES REPETIDO UN CARACTER");
            System.out.println("4. COMPARAR LONGITUD DE DOS FRASES");
            System.out.println("5. UNIR DOS FRASES");
            System.out.println("6. REEMPLAZAR LETRAS 'A'");
            System.out.println("7. BUSCAR SI CONTIENE LA LETRA INGREASADA");
            System.out.println("8. SALIR");
            System.out.println("=============================================");
            System.out.print("Seleccione una opcion: ");
            opc = leer.nextInt();
            System.out.println("=============================================");

            switch (opc) {
                case 1:
                    cs.mostrarVocales();
                    break;
                case 2:
                    cs.invertirFrase();
                    break;

                case 3:
                    System.out.print("Ingrese el caracter que desea saber cuantas veces esta repetido: ");
                    do {
                        letra = leer.next();

                        if (letra.length() != 1) {
                            System.out.print("Ingreso invalido. Ingrese un caracter: ");
                        }
                    } while (letra.length() != 1);

                    cs.vecesRepetido(letra);
                    break;

                case 4:
                    System.out.print("Ingrese una nueva frase: ");
                    frase4 = leer.next();

                    cs.compararLongitud(frase4);
                    break;

                case 5:
                    System.out.print("Ingrese la nueva frase que desea unir: ");
                    frase4 = leer.next();

                    cs.unirFrases(frase4);
                    break;

                case 6:
                    System.out.print("Ingrese el caracter que desea utilizar al reemplazar: ");
                    frase4= leer.next();

                    cs.reemplazar(frase4);
                    break;

                case 7:
                    System.out.print("Ingrese la letra a buscar: ");
                    frase4 = leer.next();

                    if(cs.contiene(frase4)){
                        System.out.println("La frase contiene la letra ingresada.");
                    }else{
                        System.out.println("La frase no contiene la letra ingresada.");
                    }
                    break;

                case 8:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Ingreso invalido");
                    break;
            }

        }while(opc!=8);

    }
}