package Model;

import java.util.LinkedList;

public class Equipo {

    String nombre, pais;
    LinkedList<Atleta> listaAtletas;

    /**
     * Método constructor de la clase Equipo
     * @param nombre
     * @param pais
     */
    public Equipo (String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaAtletas = new LinkedList<>();

    }

        // Métodos Clase Equipo //

    /**
     * Método que agrega un atleta a un equipo
     * @param atleta
     * @return false si no se pudo agregar, true si se agrego correctamente
     */
    public boolean agregarAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    System.out.println("\nEl atleta ya esta registrado en este equipo");
                    return false;
                }
            }
        }
        listaAtletas.add(atleta);
        System.out.println("\nAtleta añadido con exito");
        return true;
    }

    /**
     * Método que elimina un atleta de un equipo
     * @param atleta
     * @return false si no se pudo eliminar, true si se pudo eliminar correctamente
     */
    public boolean eliminarAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atleta.getIdentificacion().equals(atleta.getIdentificacion())) {
                    listaAtletas.remove(atleta);
                    System.out.println("\nAtleta eliminado del equipo");
                    return true;
                }
            }
        }
        System.out.println("\nEl atleta no esta registrado");
        return false;
    }

        // Settters y Getters //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LinkedList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(LinkedList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }


        // toString Clase Equipo //

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", pais=" + pais + ", listaAtletas=" + listaAtletas + "]";
    }

    
}
