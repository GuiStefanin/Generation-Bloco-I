package Exercicio02;

public class Avi�o {
	
	String modelo;
	int numPassageiros;
	double pre�oPassagem;
	boolean turbina;
	
	void voo() {
		if(this.turbina == false)
			System.out.println("Impossivel voar com a turbina desligada");
		else
			System.out.println("Decolando");
		    
	}
	
	void desligarTurbina() {
		this.turbina = false;
	}
	
	void ligarTurbina() {
		this.turbina = true;
	}
		

}
