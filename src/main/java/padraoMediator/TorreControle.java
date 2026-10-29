package padraoMediator;

public class TorreControle {

    private static TorreControle instancia = new TorreControle();

    private TorreControle() {};

    public static TorreControle getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoPousoAeronave(String mensagem) {
        return "Torre de Controle\n" +
                "A Aeronave enviou a seguinte solicitação:\n" +
                ">>" + Pista.getInstancia().receberSolicitacaoPouso(mensagem);
    }

    public String receberSolicitacaoDecolagemAeronave(String mensagem) {
        return "Torre de Controle\n" +
                "A Aeronave enviou a seguinte solicitação:\n" +
                ">>" + Pista.getInstancia().receberSolicitacaoDecolagem(mensagem);
    }

    public String receberEmergenciaAeronave(String mensagem) {
        return "Torre de Controle\n" +
                "A Aeronave enviou a seguinte solicitação:\n" +
                ">>" + Pista.getInstancia().receberEmergencia(mensagem);
    }
}
