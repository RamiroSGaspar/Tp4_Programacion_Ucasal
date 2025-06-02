package ej1;

public class Main {
    public static void main(String[] args) {
        // Crear persona usando constructor completo
        Persona persona1 = new Persona(
                1,
                38987123,
                "Benavidez",
                "Ana",
                28,
                "Femenino",
                65.5,
                1.68,
                "Av. Siempreviva 742"
        );

        // Crear persona usando constructor vacío + setters
        Persona persona2 = new Persona();
        persona2.setIdPersona(2);
        persona2.setDni(40222444);
        persona2.setApellido("Pérez");
        persona2.setNombre("Carlos");
        persona2.setEdad(35);
        persona2.setGenero("Masculino");
        persona2.setPeso(78.2);
        persona2.setAltura(1.75);
        persona2.setDomicilio("Calle Falsa 123");

        // Mostrar datos
        System.out.println(persona1);
        System.out.println(persona2);
    }
}