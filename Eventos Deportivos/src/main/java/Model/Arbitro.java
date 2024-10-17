package Model;

public class Arbitro extends Participante{

    int añosDeExperiencia;
    
    /**
     * Método constructor clase Arbitro
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param añosDeExperiencia
     */
    public Arbitro (String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento,
            int edad, String pais, int añosDeExperiencia) {
        super(nombre, apellidos, nacionalidad, identificacion, fechaNacimiento, edad, pais);
        this.añosDeExperiencia = añosDeExperiencia;
    }

        // Setters y Getters //

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

        // toString clase Arbitro //

    @Override
    public String toString() {
        return "Arbitro [nombre=" + nombre + ", apellidos=" + apellidos + ", añosDeExperiencia=" + añosDeExperiencia
                + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", identificacion=" + identificacion + ", pais="
                + pais + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    
}
