package Model;

public class PersonalApoyo extends Participante{

    int cantidadEventosPrevios;
    
    /**
     * Método constructor de la clase PersonalApoyo
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param cantidadEventosPrevios
     */
    public PersonalApoyo (String nombre, String apellidos, String nacionalidad, String identificacion,
            String fechaNacimiento, int edad, String pais, int cantidadEventosPrevios) {
        super(nombre, apellidos, nacionalidad, identificacion, fechaNacimiento, edad, pais);
        this.cantidadEventosPrevios = cantidadEventosPrevios;

    }

        // Setters y Getters //
    
    public int getCantidadEventosPrevios() {
        return cantidadEventosPrevios;
    }

    public void setCantidadEventosPrevios(int cantidadEventosPrevios) {
        this.cantidadEventosPrevios = cantidadEventosPrevios;
    }

        // toString clase PersonalApoyo

    @Override
    public String toString() {
        return "PersonalApoyo [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
                + ", cantidadEventosPrevios=" + cantidadEventosPrevios + ", nacionalidad=" + nacionalidad
                + ", identificacion=" + identificacion + ", pais=" + pais + ", fechaNacimiento=" + fechaNacimiento
                + "]";
    }

}
