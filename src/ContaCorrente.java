public class ContaCorrente extends Conta {
    private static final double LIMITE_DESCARTAVEL = 500.0; // Limite para saque além do saldo

    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + LIMITE_DESCARTAVEL) >= valor) {
            double saldoAtual = getSaldo();
            depositar(-valor); // Atualiza o saldo após o saque
            return true;
        }
        return false;
    }
}
