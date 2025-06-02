package ej5;

public class Main5 {
    public static void main(String[] args) {
        Persona persona = new Persona(
                1,
                38987123,
                "Gómez",
                "Ana",
                17,
                "Femenino",
                48.5,
                1.68,
                "Av. Siempreviva 742"
        );

        System.out.println("=== INFORMACIÓN BÁSICA ===");
        System.out.println(persona.info());

        System.out.println("\n=== ESTADO DE PESO ===");
        System.out.println(persona.IMC());

        System.out.println("\n=== VERIFICACIÓN DE EDAD ===");
        if (persona.esMayorDeEdad()) {
            System.out.println(persona.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad");
        }
    }
}