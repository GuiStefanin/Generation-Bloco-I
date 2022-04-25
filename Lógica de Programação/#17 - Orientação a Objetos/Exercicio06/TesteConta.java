package Exercicio06;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta x = new Conta();
		
		x.banco = "Stefanin Bank";
		x.numConta = 2564;
		x.saldo = 4567.98;
		x.aberta = true;
		
		x.extrato();
		
		if(x.aberta == true) 
			System.out.println("A conta "+x.numConta+" do banco "+x.banco+" possui R$"+x.saldo);

		
		
	}

}
