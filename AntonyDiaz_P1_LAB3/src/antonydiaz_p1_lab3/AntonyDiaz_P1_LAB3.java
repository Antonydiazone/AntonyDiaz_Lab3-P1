/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonydiaz_p1_lab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author antob
 */
public class AntonyDiaz_P1_LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("*");
            System.out.println("1) los juegos del hambre");
            System.out.println("2) Opción 2");
            System.out.println("3) movimiento de un Péndulo");
            System.out.println("4) Salir");
            System.out.println("*");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> asignarTributos(scanner);
                case 2 -> {
              }
                case 3 -> simulacionPendulo(scanner);
                case 4 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida.");
            }
                  }
    }

    private static void asignarTributos(Scanner scanner) {
        Random random = new Random();
        boolean repetir = true;

        while (repetir) {
            System.out.println("Ingrese el número del distrito (1, 11, o 12): ");
            int numeroDistrito = scanner.nextInt();

            String tributoMasculino = asignarTributo(random, new String[]{"Gloss", "Marvel"});
            String tributoFemenino = asignarTributo(random, new String[]{"Cashmere", "Glimmer"});

            System.out.println("Tributos seleccionados para el Distrito " + numeroDistrito + ":");
            System.out.println("Masculino: " + tributoMasculino);
            System.out.println("Femenino: " + tributoFemenino);

            System.out.println("¿Desea repetir el programa? (1: Sí, 0: No)");
            int opcionRepetir = scanner.nextInt();
            repetir = (opcionRepetir == 1);
        }

        System.out.println("Programa finalizado.");
    }

    private static String asignarTributo(Random random, String[] tributos) {
        int indice = random.nextInt(tributos.length);
        return tributos[indice];
    }

    private static void simulacionPendulo(Scanner scanner) {
        System.out.println("Ingrese la amplitud del péndulo (en metros):");
        int amplitud = Math.abs(scanner.nextInt()); // Garantiza que la amplitud sea positiva

        System.out.println("Ingrese la cantidad de tiempo (en segundos):");
        int tiempo = scanner.nextInt();

        int distancia = 0;
        int cambiosDireccion = 0;

        while (tiempo > 0) {
            System.out.println("Tiempo: " + (tiempo - 1) + " segundos - Distancia: " + distancia + " metros");

            distancia += (distancia >= 0) ? 1 : -1;

            if (distancia == amplitud || distancia == -amplitud) {
                cambiosDireccion++;
                distancia *= -1;
            }

            tiempo--;
        }

        System.out.println("El péndulo llegó a su posición inicial " + cambiosDireccion + " veces.");
    }
    }
    

