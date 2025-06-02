package ej6;

public class Persona {
    // Atributos
    private int idPersona;
    private int dni;
    private String apellido;
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    private String domicilio;

    // Constructor vacío
    public Persona() {
    }

    // Constructor completo
    public Persona(int idPersona, int dni, String apellido, String nombre,
                   int edad, String genero, double peso, double altura,
                   String domicilio) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.domicilio = domicilio;
    }

    // Getters y Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor positivo");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser un valor positivo");
        }
        this.altura = altura;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", dni=" + dni +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    public String info() {
        return dni + " - " + apellido + ", " + nombre + " - " + domicilio;
    }

    public String IMC() {
        // Validar que altura no sea cero para evitar división por cero
        if (altura <= 0) {
            throw new ArithmeticException("La altura debe ser mayor que cero para calcular el IMC");
        }

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return "Debajo de su peso ideal (IMC: " + String.format("%.1f", imc) + ")";
        } else if (imc <= 25) {
            return "Está en su peso ideal (IMC: " + String.format("%.1f", imc) + ")";
        } else {
            return "Sobrepeso (IMC: " + String.format("%.1f", imc) + ")";
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}