package Exercicio05;

public class Patinete {
	
	String cor;
	int numRodas;
	double aguenta;
	boolean anda;
	
	void Andar() {
		if(this.anda == false)
			System.out.println("O patinete não anda");
		else
			System.out.println("O patinete anda");
		    
	}
	
	void naoAndar() {
		this.anda = false;
	}
	
	void andar() {
		this.anda = true;
	}
		

}