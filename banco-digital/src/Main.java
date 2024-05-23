public class Main {
    public static void main(String[] args) {
		Cliente flavio = new Cliente();
		flavio.setNome("Flavio Junio");

		
		Conta cc = new ContaCorrente(flavio);
		Conta poupanca = new ContaPoupanca(flavio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
