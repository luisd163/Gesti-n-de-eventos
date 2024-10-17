package co.edu.uniquindio.poo;

import Model.Atleta;
import Model.Empresa;
import Model.Evento;
import Model.TipoEvento;
import Model.Ubicacion;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("UQ");
        Evento evento1 = new Evento(null, "natacion", null, null, TipoEvento.COMPETICION);
        empresa.crearEvento(evento1);
        Atleta atleta1 = new Atleta(null, null, null, "e322r3rr24", null, 0, null, 0);
        Atleta atleta2 = new Atleta(null, null, null, "dqfwgh54", null, 0, null, 0);
        empresa.crearAtleta(atleta1);
        empresa.crearAtleta(atleta2);
        evento1.crearAtleta(atleta1);
        evento1.crearAtleta(atleta2);
        atleta1.añadirEvento(evento1);
        atleta2.añadirEvento(evento1);

        Ubicacion ubicacion2 = new Ubicacion("Colombia", "Armenia");
        Evento evento2 = new Evento(null, "Futbol", null, ubicacion2, TipoEvento.EXHIBICION);
        Atleta atleta3 = new Atleta(null, null, null, "23432", null, 0, null, 0);
        empresa.crearEvento(evento2);
        evento2.crearAtleta(atleta2);
        evento2.crearAtleta(atleta3);
        empresa.crearAtleta(atleta3);

        empresa.atletasEventoNatacionCompeticion();

    }
}
