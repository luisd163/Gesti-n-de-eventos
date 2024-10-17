package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Atleta;
import Model.Empresa;
import Model.Participante;

public class TestEmpresa {

    // Evalua el funcionamiento del Método crearParticipante
    @Test
    public void crearParticipanteTest() {
        Empresa empresa = new Empresa("viy");
        Participante participante1 = new Participante(null, null, null, "ubrn92f3", null, 0, null);

        assertEquals(true, empresa.crearParticipante(participante1));
        assertEquals(false, empresa.crearParticipante(participante1)); // No se crea porque ya esta registrado


    }

    // Evalua el funcionamiento del Método eliminarParticipante
    @Test
    public void eliminarParticipanteTest() {
        Empresa empresa = new Empresa("viy");
        Participante participante1 = new Participante(null, null, null, "ubrn92f3", null, 0, null);
        empresa.crearParticipante(participante1);

        assertEquals(true, empresa.eliminarParticipante(participante1));
        assertEquals(false, empresa.eliminarParticipante(participante1)); // No se elimina porque ya no esta registrado

    }

    // Evalua el funcionamiento del Método crearAtleta
    @Test 
    public void crearAtleta() {
        Empresa empresa = new Empresa(null);
        Atleta atleta1 = new Atleta(null, null, null, "tyohi", null, 0, null, 0);

        assertEquals(true, empresa.crearAtleta(atleta1));
        assertEquals(false, empresa.crearAtleta(atleta1)); // Ya se creo previamente

    }

    // Evalua el funcionamiento del Método eliminarAtleta
    @Test
    public void eliminarAtleta() {
        Empresa empresa = new Empresa(null);
        Atleta atleta1 = new Atleta(null, null, null, "tyohi", null, 0, null, 0);

        empresa.crearAtleta(atleta1);
        assertEquals(true, empresa.eliminarAtleta(atleta1));
        assertEquals(false, empresa.eliminarAtleta(atleta1)); // Ya fue eliminado anteriormente
        
    }
}
