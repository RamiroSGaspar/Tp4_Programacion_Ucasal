package ej6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[3];

        System.out.println("=== REGISTRO DE PERSONAS ===");
        System.out.println("Ingrese los datos de 3 personas\n");

        // Pedir datos para 3 personas
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- PERSONA #" + (i + 1) + " ---");

            personas[i] = new Persona();
            personas[i].setIdPersona(i + 1);

            // DNI (8 dígitos)
            while (true) {
                System.out.print("DNI (8 dígitos sin puntos): ");
                int dni = leerEntero(scanner);
                if (dni > 10000000 && dni < 99999999) {
                    personas[i].setDni(dni);
                    break;
                } else {
                    System.out.println("Error: El DNI debe tener 8 dígitos. Intente nuevamente.");
                }
            }

            // Apellido (no vacío)
            System.out.print("Apellido: ");
            personas[i].setApellido(leerTextoNoVacio(scanner));

            // Nombre (no vacío)
            System.out.print("Nombre: ");
            personas[i].setNombre(leerTextoNoVacio(scanner));

            // Edad (0-120)
            while (true) {
                System.out.print("Edad (0-120): ");
                int edad = leerEntero(scanner);
                if (edad >= 0 && edad <= 120) {
                    personas[i].setEdad(edad);
                    break;
                } else {
                    System.out.println("Error: La edad debe estar entre 0 y 120 años. Intente nuevamente.");
                }
            }

            // Género (no vacío)
            System.out.print("Género: ");
            personas[i].setGenero(leerTextoNoVacio(scanner));

            // Peso (>0)
            while (true) {
                System.out.print("Peso (kg) [ej: 65.5]: ");
                double peso = leerDouble(scanner);
                if (peso > 0 && peso < 300) {
                    personas[i].setPeso(peso);
                    break;
                } else {
                    System.out.println("Error: El peso debe ser positivo y menor a 300 kg. Intente nuevamente.");
                }
            }

            // Altura (>0)
            while (true) {
                System.out.print("Altura (m) [ej: 1.75]: ");
                double altura = leerDouble(scanner);
                if (altura > 0.5 && altura < 2.5) {
                    personas[i].setAltura(altura);
                    break;
                } else {
                    System.out.println("Error: La altura debe estar entre 0.5 y 2.5 metros. Intente nuevamente.");
                }
            }

            // Domicilio (no vacío)
            System.out.print("Domicilio: ");
            personas[i].setDomicilio(leerTextoNoVacio(scanner));

            System.out.println("¡Persona registrada exitosamente!");
        }

        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- INFORMACIÓN DE PERSONA #" + (i + 1) + " ---");

            // a. Mostrar información básica
            System.out.println("Información básica: " + personas[i].info());

            // b. Comprobar y mostrar IMC
            try {
                System.out.println("Estado de peso: " + personas[i].IMC());
            } catch (ArithmeticException e) {
                System.out.println("Error al calcular IMC: " + e.getMessage());
            }

            // c. Verificar y mostrar si es mayor de edad
            System.out.println("Mayor de edad: " + (personas[i].esMayorDeEdad() ? "Sí" : "No"));

            // d. Mostrar todos los datos
            System.out.println("\nDatos completos:");
            System.out.println("ID: " + personas[i].getIdPersona());
            System.out.println("DNI: " + personas[i].getDni());
            System.out.println("Apellido: " + personas[i].getApellido());
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad() + " años");
            System.out.println("Género: " + personas[i].getGenero());
            System.out.printf("Peso: %.1f kg%n", personas[i].getPeso());
            System.out.printf("Altura: %.2f m%n", personas[i].getAltura());
            System.out.println("Domicilio: " + personas[i].getDomicilio());
            System.out.println("----------------------------------");
        }

        scanner.close();
        System.out.println("\nPrograma finalizado. ¡Gracias por usar el sistema!");
    }

    // Métodos auxiliares mejorados con validaciones

    /**
     * Lee un texto no vacío del usuario
     */
    private static String leerTextoNoVacio(Scanner scanner) {
        while (true) {
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.print("Este campo es obligatorio. Ingrese un valor válido: ");
        }
    }

    /**
     * Lee un número entero válido
     */
    private static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
            }
        }
    }

    /**
     * Lee un número decimal válido
     */
    private static double leerDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número decimal: ");
            }
        }
    }
}