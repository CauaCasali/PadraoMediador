package padraoMediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AeronaveComercialTest {

    @Test
    void deveSolicitarPousoAeronave() {
        AeronaveComercial aeronaveComercial = new AeronaveComercial();
        assertEquals("Torre de Controle\n" +
                        "A Aeronave enviou a seguinte solicitação:\n" +
                        ">>" + "A Pista recebeu uma solicitação de pouso: Voo AZ123 a 10 km da cabeceira",
                aeronaveComercial.solicitarPouso("Voo AZ123 a 10 km da cabeceira"));
    }

    @Test
    void deveSolicitarDecolagemAeronave() {
        AeronaveComercial aeronaveComercial = new AeronaveComercial();
        assertEquals("Torre de Controle\n" +
                        "A Aeronave enviou a seguinte solicitação:\n" +
                        ">>" + "A Pista recebeu uma solicitação de decolagem: Voo GL456 posicionado na cabeceira",
                aeronaveComercial.solicitarDecolagem("Voo GL456 posicionado na cabeceira"));
    }

    @Test
    void deveDeclararEmergenciaAeronave() {
        AeronaveComercial aeronaveComercial = new AeronaveComercial();
        assertEquals("Torre de Controle\n" +
                        "A Aeronave enviou a seguinte solicitação:\n" +
                        ">>" + "A Pista registrou uma emergência: Voo LA789 com falha no motor",
                aeronaveComercial.declararEmergencia("Voo LA789 com falha no motor"));
    }
}
