package Model;

public class Persona {
    
    String nombre, apellidos, nacionalidad, identificacion, fechaNacimiento;

    /**
     * Constructor clase Persona
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     */
    public Persona (String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

        // Setters y Getters //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

        // toString clase Persona //

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
    
}
