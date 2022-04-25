package Exercicio06;

public class Conta {
	
	String banco;
	int numConta;
	double saldo;
	boolean aberta;
	
	void extrato() {
		if(this.aberta == false)
			System.out.println("Conta bloqueada");
		else
			System.out.println("Conta ativa");
		    
	}
	
	void bloquear() {
		this.aberta = false;
	}
	
	void desbloquear() {
		this.aberta = true;
	}
		

}


