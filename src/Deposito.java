public class Deposito implements Transacao {
    private Conta conta;
    private double valor;

    public Deposito(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void realizar() {
        conta.depositar(valor);
    }
}
