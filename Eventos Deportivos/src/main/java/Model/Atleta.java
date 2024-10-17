package Model;

import java.util.LinkedList;

public class Atleta extends Participante{

    int cantidadEventosPrevios;
    Equipo equipoAtleta;
    LinkedList<Evento> listaEventos;

    /**
     * Método constructor de la clase Participante
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param cantidadEventosPrevios
     */
    public Atleta (String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento,
            int edad, String pais, int cantidadEventosPrevios) {
        super(nombre, apellidos, nacionalidad, identificacion, fechaNacimiento, edad, pais);
        this.cantidadEventosPrevios = cantidadEventosPrevios;
        listaEventos = new LinkedList<>();
    }
    
        // Métodos clase Atleta //

    /**
     * Método que agrega un equipo a un atleta
     * @param equipo
     * @return
     */
    public boolean agregarEquipo(Equipo equipo) {
        equipoAtleta = equipo;
        System.out.println("\nSe ha agregado el equipo " + equipo.getNombre() + " al atleta");
        return true;
    }

    /**
     * Método que elimina un equipo de un atleta
     * @return
     */
    public boolean eliminarEquipo() {
        String nombreEquipo = equipoAtleta.getNombre();
        System.out.println("\nSe ha eliminado el equipo " + nombreEquipo + " del atleta");
        equipoAtleta = null;
        return true;
    }

    /**
     * Método que añade un evento al historial del atleta
     * @param evento
     */
    public void añadirEvento(Evento evento) {
        listaEventos.add(evento);
    }

    /**
     * Método que elimina un evento del historial del atleta
     * @param evento
     */
    public void eliminarEvento(Evento evento) {
        listaEventos.remove(evento);
    }

        // Setters y Getters

    public int getCantidadEventosPrevios() {
        return cantidadEventosPrevios;
    }

    public void setCantidadEventosPrevios(int cantidadEventosPrevios) {
        this.cantidadEventosPrevios = cantidadEventosPrevios;
    }
    
    public Equipo getEquipoAtleta() {
        return equipoAtleta;
    }

    public void setEquipoAtleta(Equipo equipoAtleta) {
        this.equipoAtleta = equipoAtleta;
    }

    public LinkedList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(LinkedList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

        // toString clase Atleta //

    @Override
    public String toString() {
        return "Atleta [nombre=" + nombre + ", apellidos=" + apellidos + ", cantidadEventosPrevios="
                + cantidadEventosPrevios + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", pais=" + pais
                + ", identificacion=" + identificacion + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
    
    
}
