package Model;

import java.util.LinkedList;

public class Evento {

    String nombre, deporte, fechaInicio;
    Ubicacion ubicacion;
    TipoEvento tipoEvento;
    LinkedList<Participante> listaParticipantes;
    LinkedList<Atleta> listaAtletas;
    LinkedList<Equipo> listaEquipos;
    LinkedList<Arbitro> listaArbitros;
    LinkedList<Entrenador> listaEntrenadores;
    LinkedList<PersonalApoyo> listaPersonalApoyo;

    public Evento (String nombre, String deporte, String fechaInicio, Ubicacion ubicacion, TipoEvento tipoEvento) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        this.ubicacion = ubicacion;
        this.tipoEvento = tipoEvento;
        listaParticipantes = new LinkedList<>();
        listaAtletas = new LinkedList<>();
        listaEquipos = new LinkedList<>();
        listaArbitros = new LinkedList<>();
        listaEntrenadores = new LinkedList<>();
        listaPersonalApoyo = new LinkedList<>();

    }

        // Métodos clase Evento //

    /**
     * Método que crea un participante en un evento
     * @param participante
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearParticipante(Participante participante) {
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(participante.getIdentificacion())) {
                    System.out.println("\nEl participante ya esta registrado");
                    return false;
                }
            }
        }
        listaParticipantes.add(participante);
        System.out.println("\nParticipante creado exitosamente");
        return true;
    }

    /**
     * Método que elimina un participante en un evento
     * @param participante
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarParticipante(Participante participante) {
        for (Participante participanteAux : listaParticipantes) {
            if (participanteAux != null) {
                if (participanteAux.getIdentificacion().equals(participante.getIdentificacion())) {
                    listaParticipantes.remove(participante);
                    System.out.println("\nParticipante eliminado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nEl participante no esta registrado");
        return false;
    }

    /**
     * Método que actualiza un participante en un evento
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
                    System.out.println("\nParticipante actualizado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nParticipante no encontrado");
        return false;
    }

    /**
     * Método que muestra los datos de un participante en un evento
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
        participanteMensaje = "\nNo se ha encontrado el participante";
        return participanteMensaje;
    }

    /**
     * Método que crea un atleta en un evento
     * @param atleta
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    System.out.println("\nEl atleta ya esta registrado");
                    return false;
                }
            }
        }
        listaAtletas.add(atleta);
        System.out.println("\nAtleta añadido con exito");
        return true;
    }

    /**
     * Método que elimina un atleta en un evento
     * @param atleta
     * @return false si no pudo crear, true si se creo correctamente
     */
    public boolean eliminarAtleta(Atleta atleta) {
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    listaAtletas.remove(atletaAux);
                    System.out.println("\nAtleta removido con extio");
                    return true;
                }
            }
        }
        System.out.println("\nAtleta no encontrado");
        return false;
    }

    /**
     * Método que actualiza un atleta en un evento
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
                    System.out.println("\nAtleta actualizado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nEl atleta no esta registrado");
        return false;
    }

    /**
     * Método que muestra los datos de un atleta en un evento
     * @param atleta
     * @return
     */
    public String mostrarAtleta(Atleta atleta) {
        String atletaMensaje = "";
        for (Atleta atletaAux : listaAtletas) {
            if (atletaAux != null) {
                if (atletaAux.getIdentificacion().equals(atleta.getIdentificacion())) {
                    atletaMensaje = atletaAux.toString();
                    return atletaMensaje;
                }
            }
        }
        atletaMensaje = "\nNo se encontro el atleta";
        return atletaMensaje;
    }

    /**
     * Método que crea un equipo
     * @param equipo
     * @return false si no se pudo crear, true si se pudo crear correctamente
     */
    public boolean crearEquipo(Equipo equipo) {
        for (Equipo equipoAux : listaEquipos) {
            if (equipoAux != null) {
                if (equipoAux.getNombre().equals(equipo.getNombre())) {
                    System.out.println("\nEl equipo ya esta registrado");
                    return false;
                }
            }
        }
        listaEquipos.add(equipo);
        System.out.println("\nEquipo añadido con exito");
        return true;
    }

    /**
     * Método que elimina un equipo 
     * @param equipo
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEquipo(Equipo equipo) {
        for (Equipo equipoAux : listaEquipos) {
            if (equipoAux != null) {
                if (equipoAux.getNombre().equals(equipo.getNombre())) {
                    listaEquipos.remove(equipo);
                    System.out.println("\nEquipo eliminado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nNo se encontro el equipo");
        return false;
    }

    /**
     * Método que actualiza un equipo
     * @param nombre
     * @param pais
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizarEquipo(String nombre, String pais) {
        for (Equipo equipoAux : listaEquipos) {
            if (equipoAux != null) {
                if (equipoAux.getNombre().equals(nombre)) {
                    equipoAux.setNombre(nombre);
                    equipoAux.setPais(pais);
                    equipoAux.setListaAtletas(listaAtletas);
                    System.out.println("\nEquipo actualizado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nNo se ha encontrado el equipo");
        return false;
    }

    /**
     * Método que muestra la informacion de un equipo
     * @param equipo
     * @return Cadena con la informacion del equipo
     */
    public String mostrarEquipo(Equipo equipo) {
        String equipoMensaje = "";
        for (Equipo equipoAux : listaEquipos) {
            if (equipoAux != null) {
                if (equipoAux.getNombre().equals(equipo.getNombre())) {
                    equipoMensaje = equipoAux.toString();
                    return equipoMensaje;
                }
            }
        }
        equipoMensaje = "\nNo se ha encontrado el equipo";
        return equipoMensaje;
    }

    /**
     * Método que crea un arbitro
     * @param arbitro
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearArbitro(Arbitro arbitro) {
        for (Arbitro arbitroAux : listaArbitros) {
            if (arbitroAux != null) {
                if (arbitroAux.getIdentificacion().equals(arbitro.getIdentificacion())) {
                    System.out.println("\nEl arbitro ya esta registrado");
                    return false;
                }
            }
        }
        listaArbitros.add(arbitro);
        System.out.println("\nArbitro añadido correctamente");
        return true;
    }

    /**
     * Método que elimina un arbitro
     * @param arbitro
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarArbitro(Arbitro arbitro) {
        for (Arbitro arbitroAux : listaArbitros) {
            if (arbitroAux.getIdentificacion().equals(arbitro.getIdentificacion())) {
                listaArbitros.remove(arbitro);
                System.out.println("\nArbitro eliminado correctamente");
                return true;
            }
        }
        System.out.println("\nNo se ha encontrado el arbitro ingresado");
        return false;
    }

    /**
     * Método que actualiza un arbitro
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param añosDeExperiencia
     * @return
     */
    public boolean actualizarArbitro(String nombre, String apellidos, String nacionalidad, String identificacion, String fechaNacimiento, int edad, String pais, int añosDeExperiencia) {
        for (Arbitro arbitroAux : listaArbitros) {
            if (arbitroAux != null) {
                if (arbitroAux.getIdentificacion().equals(identificacion)) {
                    arbitroAux.setNombre(nombre);
                    arbitroAux.setApellidos(apellidos);
                    arbitroAux.setNacionalidad(nacionalidad);
                    arbitroAux.setIdentificacion(identificacion);
                    arbitroAux.setFechaNacimiento(fechaNacimiento);
                    arbitroAux.setEdad(edad);
                    arbitroAux.setPais(pais);
                    arbitroAux.setAñosDeExperiencia(añosDeExperiencia);
                    System.out.println("\nArbitro actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nNo se ha encontrado el arbitro");
        return false;
    }

    /**
     * Método que crea un entrenador
     * @param entrenador
     * @return
     */
    public boolean crearEntrenador(Entrenador entrenador) {
        for (Entrenador entrenadorAux : listaEntrenadores) {
            if (entrenadorAux != null) {
                if (entrenadorAux.getIdentificacion().equals(entrenador.getIdentificacion())) {
                    System.out.println("\nEl entrenador ya esta registrado");
                    return false;
                }
            }
        }
        listaEntrenadores.add(entrenador);
        System.out.println("\nEntrenador añadido con exito");
        return true;
    }

    /**
     * Método que elimina un entrenador
     * @param entrenador
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEntrenador(Entrenador entrenador) {
        for (Entrenador entrenadorAux : listaEntrenadores) {
            if (entrenadorAux != null) {
                if (entrenadorAux.getIdentificacion().equals(entrenador.getIdentificacion())) {
                    listaEntrenadores.remove(entrenador);
                    System.out.println("\nEntrenador eliminado con exito");
                    return true;
                }
            }
        }
        System.out.println("\nEl entrenador no esta registrado");
        return false;
    }

    /**
     * Método que actualiza un entrenador
     * @param nombre
     * @param apellidos
     * @param nacionalidad
     * @param identificacion
     * @param fechaNacimiento
     * @param edad
     * @param pais
     * @param especializacion
     * @return false si no se pudo actualizar, true si se actualizo correctamente
     */
    public boolean actualizaroEntrenador(String nombre, String apellidos, String nacionalidad, String identificacion,
    String fechaNacimiento, int edad, String pais, String especializacion) {
        for (Entrenador entrenadorAux : listaEntrenadores) {
            if (entrenadorAux != null) {
                if (entrenadorAux.getIdentificacion().equals(identificacion)) {
                    entrenadorAux.setNombre(nombre);
                    entrenadorAux.setApellidos(apellidos);
                    entrenadorAux.setNacionalidad(nacionalidad);
                    entrenadorAux.setIdentificacion(identificacion);
                    entrenadorAux.setFechaNacimiento(fechaNacimiento);
                    entrenadorAux.setEdad(edad);
                    entrenadorAux.setPais(pais);
                    entrenadorAux.setEspecializacion(especializacion);
                    System.out.println("\nEntrenador actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl entrenador no esta registrado");
        return false;
    }

    /**
     * Método que crea un personal de apoyo
     * @param personal
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearPersonalApoyo(PersonalApoyo personal) {
        for (PersonalApoyo personalAux : listaPersonalApoyo) {
            if (personalAux != null) {
                if (personalAux.getIdentificacion().equals(personal.getIdentificacion())) {
                    System.out.println("\nEl Personal ya esta registrado");
                    return false;
                }
            }
        }
        listaPersonalApoyo.add(personal);
        System.out.println("\nPersonal añadido correctamente");
        return true;
    }

    /**
     * Método que elimina un personal de apoyo
     * @param personal
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarPersonalApoyo(PersonalApoyo personal) {
        for (PersonalApoyo personalAux : listaPersonalApoyo) {
            if (personalAux != null) {
                if (personalAux.getIdentificacion().equals(personal.getIdentificacion())) {
                    listaPersonalApoyo.remove(personal);
                    System.out.println("\nPersonal eliminado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl personal no esta registrado"); {
        return false;
        }
    }

    /**
     * Método que actualiza un personal de apoyo
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
    public boolean actualizarPersonalApoyo(String nombre, String apellidos, String nacionalidad, String identificacion,
    String fechaNacimiento, int edad, String pais, int cantidadEventosPrevios) {
        for (PersonalApoyo personalAux : listaPersonalApoyo) {
            if (personalAux != null) {
                if (personalAux.getIdentificacion().equals(identificacion)) {
                    personalAux.setNombre(nombre);
                    personalAux.setApellidos(apellidos);
                    personalAux.setNacionalidad(nacionalidad);
                    personalAux.setIdentificacion(identificacion);
                    personalAux.setFechaNacimiento(fechaNacimiento);
                    personalAux.setEdad(edad);
                    personalAux.setPais(pais);
                    personalAux.setCantidadEventosPrevios(cantidadEventosPrevios);
                    System.out.println("\nPersonal de apoyo actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl personal de apoyo no esta registrado");
        return false;
    }

        // Setters y Getters //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
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

    public LinkedList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(LinkedList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

        // toString clase Evento //

    @Override
    public String toString() {
        return "Evento [nombre=" + nombre + ", deporte=" + deporte + ", fechaInicio=" + fechaInicio + ", ubicacion="
                + ubicacion + ", tipoEvento=" + tipoEvento + ", listaParticipantes=" + listaParticipantes
                + ", listaAtletas=" + listaAtletas + ", listaEquipos=" + listaEquipos + "]";
    }

    
}
