package ej7;

public class Main7 {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(
                1,
                25456879,
                "García",
                "Laura",
                42,
                "Femenino",
                62.5,
                1.65,
                "Calle del Saber 123",
                "Matemáticas",
                30
        );

        Profesor profesor2 = new Profesor();
        profesor2.setIdPersona(2);
        profesor2.setDni(35254123);
        profesor2.setApellido("Rodríguez");
        profesor2.setNombre("Carlos");
        profesor2.setEdad(38);
        profesor2.setGenero("Masculino");
        profesor2.setPeso(75.0);
        profesor2.setAltura(1.78);
        profesor2.setDomicilio("Av. Educación 456");
        profesor2.setMateria("Física");
        profesor2.setCargaHoraria(25);

        System.out.println("=== PROFESOR 1 ===");
        System.out.println(profesor1.toString());
        System.out.println("Info básica: " + profesor1.info());
        System.out.println("IMC: " + profesor1.IMC());
        System.out.println("Mayor de edad: " + profesor1.esMayorDeEdad());

        System.out.println("\n=== PROFESOR 2 ===");
        System.out.println(profesor2.toString());
        System.out.println("Info básica: " + profesor2.info());
    }
}
