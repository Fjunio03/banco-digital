public class Conta implements  InterfaceConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 120001;

    protected int agencia;
    protected double saldo;
    protected int numero;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.numero = Conta.SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestido) {
        this.sacar(valor);
        contaDestido.depositar(valor);
    }

    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void imprimirExtrato() {
    }
    
}
