package Model;

public class Ubicacion {

    String pais, ciudad;

    /**
     * Método constructor de la clase Ubicacion
     * @param pais
     * @param ciudad
     */
    public Ubicacion (String pais, String ciudad) {
        this.pais = pais;
        this.ciudad = ciudad;
    }

        // Setters y Getters //

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
        // toString clase Ubicacion //

    @Override
    public String toString() {
        return "Ubicacion [pais=" + pais + ", ciudad=" + ciudad + "]";
    }

    
}
