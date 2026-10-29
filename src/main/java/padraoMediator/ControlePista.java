package padraoMediator;

public interface ControlePista {
    String receberSolicitacaoPouso(String mensagem);
    String receberSolicitacaoDecolagem(String mensagem);
    String receberEmergencia(String mensagem);
}
