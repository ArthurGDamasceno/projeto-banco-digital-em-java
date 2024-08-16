public class Saque implements Transacao {
    private Conta conta;
    private double valor;

    public Saque(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void realizar() {
        if (!conta.sacar(valor)) {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
    }
}