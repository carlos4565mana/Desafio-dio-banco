
public class Program {

	public static void main(String[] args) {
		Cliente Carlos = new Cliente();
		Carlos.setNome("Carlos");
		
		Cliente Edileide = new Cliente();
		Edileide.setNome("Edileide");
		
		
		Conta cc = new ContaCorrente(Carlos);
		Conta poupanca = new ContaPoupanca(Carlos);
		
		Conta cc1 = new ContaCorrente(Edileide);
		Conta poupanca1 = new ContaPoupanca(Edileide);
		
		cc.depositar(1200);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc1.depositar(1200);
		cc1.transferir(200, poupanca);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		

	}

}
