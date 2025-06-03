package ej10;

import java.util.Scanner;

public class MainScannerProfesores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profesor[] profesores = new Profesor[3]; // Array para 3 profesores

        System.out.println("=== SISTEMA DE REGISTRO DE PROFESORES ===");
        System.out.println("Ingrese los datos de 3 profesores\n");

        // Ingreso de datos con Scanner
        for (int i = 0; i < profesores.length; i++) {
            System.out.println("\n--- PROFESOR #" + (i + 1) + " ---");

            profesores[i] = new Profesor();
            profesores[i].setIdPersona(i + 1);

            // DNI
            System.out.print("DNI (8 dígitos): ");
            profesores[i].setDni(leerEntero(scanner, 10000000, 99999999));

            // Apellido y Nombre
            System.out.print("Apellido: ");
            profesores[i].setApellido(scanner.nextLine());

            System.out.print("Nombre: ");
            profesores[i].setNombre(scanner.nextLine());

            // Edad
            System.out.print("Edad (18-70): ");
            profesores[i].setEdad(leerEntero(scanner, 18, 70));

            // Género
            System.out.print("Género: ");
            profesores[i].setGenero(scanner.nextLine());

            // Peso y Altura
            System.out.print("Peso (kg): ");
            profesores[i].setPeso(leerDouble(scanner, 30, 150));

            System.out.print("Altura (m): ");
            profesores[i].setAltura(leerDouble(scanner, 1.50, 2.20));

            // Domicilio
            System.out.print("Domicilio: ");
            profesores[i].setDomicilio(scanner.nextLine());

            // Datos específicos de Profesor
            System.out.print("Materia que enseña: ");
            profesores[i].setMateria(scanner.nextLine());

            System.out.print("Carga horaria semanal: ");
            profesores[i].setCargaHoraria(leerEntero(scanner, 1, 40));
        }

        // Mostrar todos los profesores
        System.out.println("\n=== LISTA COMPLETA DE PROFESORES ===");
        for (Profesor profesor : profesores) {
            mostrarProfesor(profesor);
        }

        // Filtrar por carga horaria (ejercicio 9 integrado)
        System.out.print("\nIngrese el mínimo de horas para filtrar: ");
        int minHoras = leerEntero(scanner, 1, 40);

        System.out.println("\n=== PROFESORES CON CARGA HORARIA >= " + minHoras + " ===");
        int contador = 0;
        for (Profesor profesor : profesores) {
            if (profesor.getCargaHoraria() >= minHoras) {
                mostrarProfesor(profesor);
                contador++;
            }
        }

        System.out.println("Total encontrados: " + contador);
        scanner.close();
    }

    // Métodos auxiliares mejorados
    private static int leerEntero(Scanner scanner, int min, int max) {
        while (true) {
            try {
                System.out.print("(" + min + "-" + max + "): ");
                int valor = Integer.parseInt(scanner.nextLine());
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Error: Debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido");
            }
        }
    }

    private static double leerDouble(Scanner scanner, double min, double max) {
        while (true) {
            try {
                System.out.print("(" + min + "-" + max + "): ");
                double valor = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Error: Debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número decimal válido");
            }
        }
    }

    private static void mostrarProfesor(Profesor p) {
        System.out.println("\n----------------------------------");
        System.out.println("ID: " + p.getIdPersona());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Nombre: " + p.getApellido() + ", " + p.getNombre());
        System.out.println("Edad: " + p.getEdad() + " | Género: " + p.getGenero());
        System.out.printf("Peso: %.1f kg | Altura: %.2f m%n", p.getPeso(), p.getAltura());
        System.out.println("Domicilio: " + p.getDomicilio());
        System.out.println("Materia: " + p.getMateria());
        System.out.println("Carga horaria: " + p.getCargaHoraria() + " horas/semana");
        System.out.println("IMC: " + p.IMC());
        System.out.println("Mayor de edad: " + (p.esMayorDeEdad() ? "Sí" : "No"));
        System.out.println("----------------------------------");
    }
}
