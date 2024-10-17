package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

import Model.Atleta;
import Model.Empresa;
import Model.Evento;
import Model.TipoEvento;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;


public class TestatletasEventoNatacionCompeticion {

    @Test
    public void atletasEventoNatacionCompeticionTest() {
        Empresa empresa1 = new Empresa("UQ");
        Evento evento1 = new Evento(null, "natacion", null, null, TipoEvento.COMPETICION);
        Atleta atleta1 = new Atleta(null, null, null, "32tyg", null, 0, null, 0);
        Atleta atleta2 = new Atleta(null, null, null, "fewgr", null, 0, null, 0);

        empresa1.crearAtleta(atleta1);
        empresa1.crearAtleta(atleta2);

        evento1.crearAtleta(atleta1);
        evento1.crearAtleta(atleta2);

        atleta1.añadirEvento(evento1);
        atleta2.añadirEvento(evento1);

        Evento evento2 = new Evento(null, "Futbol", null, null, TipoEvento.EXHIBICION);
        Atleta atleta3 = new Atleta(null, null, null, "u9byv", null, 0, null, 0);

        evento2.crearAtleta(atleta1);
        evento2.crearAtleta(atleta3);

        atleta1.añadirEvento(evento2);
        atleta3.añadirEvento(evento2);

        // Lista de atletas esperados
        List<Atleta> atletasEsperados = List.of(
            atleta1,
            atleta2
        );

        assertIterableEquals(atletasEsperados, empresa1.atletasEventoNatacionCompeticion());
    }
}

