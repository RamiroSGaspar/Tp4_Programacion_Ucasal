package ej9;

public class Main9 {
    public static void main(String[] args) {
        Profesor[] profesores = new Profesor[10];

        profesores[0] = new Profesor(1, 25456879, "García", "Laura", 42, "Femenino", 62.5, 1.65,
                "Calle del Saber 123", "Matemáticas", 30);
        profesores[1] = new Profesor(2, 35254123, "Rodríguez", "Carlos", 38, "Masculino", 75.0, 1.78,
                "Av. Educación 456", "Física", 25);
        profesores[2] = new Profesor(3, 28765432, "López", "María", 45, "Femenino", 60.0, 1.62,
                "Calle Conocimiento 789", "Química", 35);
        profesores[3] = new Profesor(4, 33222111, "Martínez", "Juan", 32, "Masculino", 80.0, 1.80,
                "Boulevard Aprendizaje 101", "Literatura", 20);
        profesores[4] = new Profesor(5, 40555666, "Fernández", "Sofía", 29, "Femenino", 58.0, 1.70,
                "Camino Sabiduría 222", "Biología", 30);
        profesores[5] = new Profesor(6, 37654321, "Pérez", "Diego", 50, "Masculino", 85.0, 1.75,
                "Avenida Ciencia 333", "Historia", 25);
        profesores[6] = new Profesor(7, 25678901, "Gómez", "Ana", 36, "Femenino", 63.0, 1.68,
                "Pasaje Filosofía 444", "Filosofía", 5);  // <-- Carga horaria = 5
        profesores[7] = new Profesor(8, 33567890, "Díaz", "Miguel", 41, "Masculino", 78.0, 1.82,
                "Ronda Tecnología 555", "Informática", 40);
        profesores[8] = new Profesor(9, 40123456, "Ruiz", "Elena", 34, "Femenino", 59.0, 1.65,
                "Travesía Arte 666", "Artes Plásticas", 15);
        profesores[9] = new Profesor(10, 38987123, "Hernández", "Luis", 47, "Masculino", 82.0, 1.77,
                "Plaza Música 777", "Música", 8);

        // Mostrar todos los profesores (ejercicio 8)
        System.out.println("=== LISTA COMPLETA DE PROFESORES ===");
        for (int i = 0; i < profesores.length; i++) {
            System.out.println("\n--- PROFESOR #" + (i + 1) + " ---");
            mostrarProfesor(profesores[i]);
        }

        // Ejercicio 9: Filtrar por carga horaria > 10
        System.out.println("\n\n=== PROFESORES CON CARGA HORARIA > 10 ===");
        int contadorFiltrado = 1;
        for (Profesor profesor : profesores) {
            if (profesor.getCargaHoraria() > 10) {
                System.out.println("\n--- PROFESOR FILTRADO #" + contadorFiltrado++ + " ---");
                mostrarProfesor(profesor);
            }
        }

        // Mostrar resumen estadístico
        System.out.println("\n=== RESUMEN EJERCICIO 9 ===");
        System.out.println("Total de profesores: " + profesores.length);
        System.out.println("Profesores con carga > 10 horas: " + (contadorFiltrado - 1));
        System.out.println("Profesores descartados: " + (profesores.length - (contadorFiltrado - 1)));
    }

    // Método para mostrar información detallada
    private static void mostrarProfesor(Profesor p) {
        System.out.println("ID: " + p.getIdPersona());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Nombre completo: " + p.getApellido() + ", " + p.getNombre());
        System.out.println("Edad: " + p.getEdad() + " años | Género: " + p.getGenero());
        System.out.printf("Peso: %.1f kg | Altura: %.2f m%n", p.getPeso(), p.getAltura());
        System.out.println("Domicilio: " + p.getDomicilio());
        System.out.println("Materia: " + p.getMateria());
        System.out.println("Carga horaria: " + p.getCargaHoraria() + " horas");
        System.out.println("IMC: " + p.IMC());
        System.out.println("Mayor de edad: " + (p.esMayorDeEdad() ? "Sí" : "No"));
        System.out.println("----------------------------------");
    }
}