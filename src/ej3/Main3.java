package ej3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de 10 personas
        Persona[] personas = new Persona[10];

        // Inicializar cada elemento del arreglo
        personas[0] = new Persona(1, 38987123, "Gómez", "Ana", 28, "Femenino", 65.5, 1.68, "Av. Siempreviva 742");
        personas[1] = new Persona(2, 40222444, "Pérez", "Carlos", 35, "Masculino", 78.2, 1.75, "Calle Falsa 123");
        personas[2] = new Persona(3, 15456897, "López", "María", 42, "Femenino", 61.8, 1.62, "Av. Rivadavia 1200");
        personas[3] = new Persona(4, 33222111, "Rodríguez", "Juan", 19, "Masculino", 70.5, 1.80, "Calle 10 # 20-30");
        personas[4] = new Persona(5, 40555666, "García", "Laura", 26, "Femenino", 58.3, 1.70, "Carrera 5 # 15-25");

        // Agregar 5 personas más
        personas[5] = new Persona(6, 28765432, "Martínez", "Luis", 31, "Masculino", 82.0, 1.78, "Av. Libertador 1500");
        personas[6] = new Persona(7, 33567890, "Fernández", "Sofía", 24, "Femenino", 55.0, 1.65, "Calle 30 # 40-50");
        personas[7] = new Persona(8, 40123456, "Díaz", "Miguel", 45, "Masculino", 90.5, 1.82, "Diagonal 80 # 60-40");
        personas[8] = new Persona(9, 25678901, "Ruiz", "Elena", 29, "Femenino", 62.0, 1.67, "Av. Central 500");
        personas[9] = new Persona(10, 37654321, "Hernández", "Diego", 22, "Masculino", 75.0, 1.76, "Carrera 7 # 20-15");

        // Mostrar todas las personas usando el método toString()
        System.out.println("=== LISTA COMPLETA DE PERSONAS ===");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Mostrar con formato mejorado
        System.out.println("\n=== INFORMACIÓN DETALLADA ===");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nPersona #" + (i + 1));
            mostrarPersona(personas[i]);
        }
    }

    // Método auxiliar para mostrar información formateada
    private static void mostrarPersona(Persona p) {
        System.out.println("ID: " + p.getIdPersona());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Apellido y Nombre: " + p.getApellido() + ", " + p.getNombre());
        System.out.println("Edad: " + p.getEdad() + " años | Género: " + p.getGenero());
        System.out.printf("Peso: %.1f kg | Altura: %.2f m\n", p.getPeso(), p.getAltura());
        System.out.println("Domicilio: " + p.getDomicilio());
        System.out.println("----------------------------------");
    }
}