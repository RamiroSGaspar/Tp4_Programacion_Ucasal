package ej10;

public class Profesor extends Persona {
    // Atributos adicionales
    private String materia;
    private int cargaHoraria;

    // Constructor vacío
    public Profesor() {
        super(); // Llama al constructor vacío de Persona
    }

    // Constructor completo (incluyendo atributos de Persona)
    public Profesor(int idPersona, int dni, String apellido, String nombre,
                    int edad, String genero, double peso, double altura,
                    String domicilio, String materia, int cargaHoraria) {
        super(idPersona, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
        this.materia = materia;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters y Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria < 0) {
            throw new IllegalArgumentException("La carga horaria no puede ser negativa");
        }
        this.cargaHoraria = cargaHoraria;
    }

    // Método toString() que incluye los nuevos atributos
    @Override
    public String toString() {
        return "Profesor{" +
                super.toString().replace("Persona{", "") + // Hereda toString de Persona
                ", materia='" + materia + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    // Método info() extendido para profesores
    @Override
    public String info() {
        return super.info() + " | Materia: " + materia + " (" + cargaHoraria + " horas)";
    }
}

