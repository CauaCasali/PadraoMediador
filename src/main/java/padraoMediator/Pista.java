package padraoMediator;

public class Pista implements ControlePista {

    private static Pista instancia = new Pista();

    private Pista() {};

    public static Pista getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoPouso(String mensagem) {
       return "A Pista recebeu uma solicitação de pouso: " + mensagem;
    }

    public String receberSolicitacaoDecolagem(String mensagem) {
        return "A Pista recebeu uma solicitação de decolagem: " + mensagem;
    }

    public String receberEmergencia(String mensagem) {
        return "A Pista registrou uma emergência: " + mensagem;
    }
}
