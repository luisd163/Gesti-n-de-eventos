package Model;

import java.util.LinkedList;
import java.util.List;

public class Empresa {

    String nombre;
    LinkedList<Evento> listaEventos;
    LinkedList<Participante> listaParticipantes;
    LinkedList<Atleta> listaAtletas;
    LinkedList<Ubicacion> listaUbicaciones;

    /**
     * Métododo constructor de la clase Empresa
     * @param nombre

     */
    public Empresa (String nombre) {
        this.nombre = nombre;
        listaEventos = new LinkedList<>();
        listaParticipantes = new LinkedList<>();
        listaAtletas = new LinkedList<>();
        listaUbicaciones = new LinkedList<>();

    }

        // métodos clase Evento //

    /**
     * Método que crea un evento
     * @param evento
     * @return
     */
    public boolean crearEvento(Evento evento) {
        listaEventos.add(evento);
        System.out.println("\nEvento creado exitosamente");
        return true;
    }

    /**
     * Método que elimina un evento
     * @param evento
     * @return
     */
    public boolean eliminarEvento(Evento evento) {
        listaEventos.remove(evento);
        System.out.println("\nEvento eliminado con exito");
        return true;
    }
    /**
     * Método que crea un participante en la empresa
     * @param participante
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearParticipante(Participante participante) {
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(participante.getIdentificacion())) {
                    System.out.println("\nEl participante ya esta registrado en la empresa");
                    return false;
                }
            }
        }
        listaParticipantes.add(participante);
        System.out.println("\nParticipante creado exitosamente en la empresa");
        return true;
    }

    /**
     * Método que elimina un participante en la empresa
     * @param participante
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarParticipante(Participante participante) {
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(participante.getIdentificacion())) {
                    listaParticipantes.remove(participante);
                    System.out.println("\nParticipante eliminado de la empresa con exito");
                    return true;
                }
            }
        }
        System.out.println("\nEl participante no esta registrado en la empresa");
        return false;
    }

    /**
     * Método que actualiza un participante en la empresa
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarParticipante(String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento, int edad, String pais) {
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(identificacion)) {
                    participanteAux.setNombre(nombre);
                    participanteAux.setApellidos(apellidos);
                    participanteAux.setNacionalidad(nacionalidad);
                    participanteAux.setIdentificacion(identificacion);
                    participanteAux.setFechaNacimiento(fechaNacimiento);
                    participanteAux.setEdad(edad);
                    participanteAux.setPais(pais);
                    System.out.println("\nParticipante actualizado en la empresa con exito");
                    return true;
                }
            }
        }
        System.out.println("\nParticipante no encontrado en la empresa");
        return false;
    }

    /**
     * Método que muestra los datos de un participante en la empresa
     * @param participante
     * @return
     */
    public String mostrarParticipante(Participante participante) {
        String participanteMensaje = "";
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(participante.getIdentificacion())) {
                    participanteMensaje = participanteAux.toString();
                    return participanteMensaje;
                }
            }
        }
        participanteMensaje = "\nNo se ha encontrado el participante en la empresa";
        return participanteMensaje;
    }

    /**
     * Método que crea un atleta
     * @param atleta
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    System.out.println("\nEl atleta ya esta registrado en la empresa");
                    return false;
                }
            }
        }
        listaAtletas.add(atleta);
        System.out.println("\nAtleta añadido con exito en la empresa");
        return true;
    }

    /**
     * Método que elimina un atleta
     * @param atleta
     * @return false si non se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    listaAtletas.remove(atletaAux);
                    System.out.println("\nAtleta eliminado de la empresa correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl atleta no esta registrado en la empresa");
        return false;
    }

    /**
     * Método que actualiza un atleta
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param cantidadEventosPrevios
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarAtleta(String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento, int edad, String pais, int cantidadEventosPrevios) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(identificacion)) {
                    atletaAux.setNombre(nombre);
                    atletaAux.setApellidos(apellidos);
                    atletaAux.setNacionalidad(nacionalidad);
                    atletaAux.setIdentificacion(identificacion);
                    atletaAux.setFechaNacimiento(fechaNacimiento);
                    atletaAux.setEdad(edad);
                    atletaAux.setPais(pais);
                    atletaAux.setCantidadEventosPrevios(cantidadEventosPrevios);
                    System.out.println("\nAtleta actualizado en la empresa correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nNo se ha encontrado el atleta en la empresa");
        return false;
    }

    /**
     * Método que crea una lista de atletas que participaron anteriormente en eventos de natacion de tipo competicion
     * @return Lista con los atletas que cumplen los requisitos
     */
    public List<Atleta> atletasEventoNatacionCompeticion() {
        List<Atleta> listaAtletasNatacionCompeticion;
        listaAtletasNatacionCompeticion = new LinkedList<>();
        for (Atleta atleta : listaAtletas) {
            if (atleta != null) {
                for (Evento evento : atleta.getListaEventos()) {
                    if (evento != null) {
                        if (evento.getDeporte().toLowerCase().equals("natacion") && evento.getTipoEvento().equals(TipoEvento.COMPETICION)) {
                            listaAtletasNatacionCompeticion.add(atleta);
                            break;
                        }
                    }
                }
            }
        }
        return listaAtletasNatacionCompeticion;
    }

        // Setters y Getters clase Empresa //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(LinkedList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public LinkedList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(LinkedList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public LinkedList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(LinkedList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public LinkedList<Ubicacion> getListaUbicaciones() {
        return listaUbicaciones;
    }

    public void setListaUbicaciones(LinkedList<Ubicacion> listaUbicaciones) {
        this.listaUbicaciones = listaUbicaciones;
    }

        // toString clase Empresa //

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", listaEventos=" + listaEventos + ", listaParticipantes="
                + listaParticipantes + ", listaAtletas=" + listaAtletas + ", listaUbicaciones=" + listaUbicaciones
                + "]";
    }
    
    
}    
