package Model;

public class Entrenador extends Participante{

    String especializacion;

    /**
     * Método constructor de la clase Entrenador
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param especializacion
     */
    public Entrenador (String nombre, String apellidos, String nacionalidad, String identificacion,
            String fechaNacimiento, int edad, String pais, String especializacion) {
        super(nombre, apellidos, nacionalidad, identificacion, fechaNacimiento, edad, pais);
        this.especializacion = especializacion;
    }

        // Setters y Getters //

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

        // toString clase Entrenador //

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", especializacion="
                + especializacion + ", nacionalidad=" + nacionalidad + ", identificacion=" + identificacion + ", pais="
                + pais + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
