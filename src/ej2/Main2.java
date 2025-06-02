package ej2;

public class Main2 {
    public static void main(String[] args) {
        // Crear 5 personas usando diferentes métodos
        Persona persona1 = new Persona(
                1,
                38987123,
                "Gómez",
                "Ana",
                28,
                "Femenino",
                65.5,
                1.68,
                "Av. Siempreviva 742"
        );

        Persona persona2 = new Persona(
                2,
                40222444,
                "Pérez",
                "Carlos",
                35,
                "Masculino",
                78.2,
                1.75,
                "Calle Falsa 123"
        );

        Persona persona3 = new Persona();
        persona3.setIdPersona(3);
        persona3.setDni(15456897);
        persona3.setApellido("López");
        persona3.setNombre("María");
        persona3.setEdad(42);
        persona3.setGenero("Femenino");
        persona3.setPeso(61.8);
        persona3.setAltura(1.62);
        persona3.setDomicilio("Av. Rivadavia 1200");

        Persona persona4 = new Persona(
                4,
                33222111,
                "Rodríguez",
                "Juan",
                19,
                "Masculino",
                70.5,
                1.80,
                "Calle 10 # 20-30"
        );

        Persona persona5 = new Persona();
        persona5.setIdPersona(5);
        persona5.setDni(40555666);
        persona5.setApellido("García");
        persona5.setNombre("Laura");
        persona5.setEdad(26);
        persona5.setGenero("Femenino");
        persona5.setPeso(58.3);
        persona5.setAltura(1.70);
        persona5.setDomicilio("Carrera 5 # 15-25");

        // Mostrar todas las personas
        System.out.println("=== LISTA DE PERSONAS ===");
        mostrarPersona(persona1);
        mostrarPersona(persona2);
        mostrarPersona(persona3);
        mostrarPersona(persona4);
        mostrarPersona(persona5);
    }

    // Método auxiliar para mostrar información de una persona
    private static void mostrarPersona(Persona p) {
        System.out.println("\nID: " + p.getIdPersona());
        System.out.println("Nombre completo: " + p.getApellido() + ", " + p.getNombre());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Edad: " + p.getEdad() + " años | Género: " + p.getGenero());
        System.out.println("Peso: " + p.getPeso() + " kg | Altura: " + p.getAltura() + " m");
        System.out.println("Domicilio: " + p.getDomicilio());
        System.out.println("----------------------------------");
    }
}
