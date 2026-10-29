package padraoMediator;

public class Aeronave {

    public String solicitarPouso(String mensagem) {
        return TorreControle.getInstancia().receberSolicitacaoPousoAeronave(mensagem);
    }

    public String solicitarDecolagem(String mensagem) {
        return TorreControle.getInstancia().receberSolicitacaoDecolagemAeronave(mensagem);
    }

    public String declararEmergencia(String mensagem) {
        return TorreControle.getInstancia().receberEmergenciaAeronave(mensagem);
    }
}
