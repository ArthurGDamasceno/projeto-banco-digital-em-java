import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumeroConta(), conta);
    }

    public Conta getConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void realizarTransacao(String numeroConta, Transacao transacao) {
        Conta conta = getConta(numeroConta);
        if (conta != null) {
            transacao.realizar();
        }
    }
}

