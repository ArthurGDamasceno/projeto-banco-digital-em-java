public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.02; // 2% ao mês

    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            double saldoAtual = getSaldo();
            depositar(-valor); // Atualiza o saldo após o saque
            return true;
        }
        return false;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
    }
}
