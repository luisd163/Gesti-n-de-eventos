package Model;


public class Participante extends Persona {

    int edad;
    String pais;

    /**
     * Método constructor clase Participante
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     */
    public Participante(String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento, int edad, String pais) {
        super(nombre, apellidos, nacionalidad, identificacion, fechaNacimiento);
        this.edad = edad;
        this.pais = pais;

    }

        // Setters y Getters //

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

        // toString clase Participante //

    @Override
    public String toString() {
        return "Participante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", nacionalidad="
                + nacionalidad + ", pais=" + pais + ", identificacion=" + identificacion + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

}
