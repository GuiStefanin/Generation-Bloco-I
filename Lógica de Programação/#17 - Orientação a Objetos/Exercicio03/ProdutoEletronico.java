package Exercicio03;

public class ProdutoEletronico {
	
	String marca;
	int bateria;
	double versao;
	boolean ligado;
	
	void usar() {
		if(this.ligado == true )
			System.out.println("Aparelho ligado");
		else
			System.out.println("Aparelho desligado");
		    
	}
	
	void desligarAparelho() {
		this.ligado = false;
	}
	
	void ligarAparelho() {
		this.ligado = true;
	}
		

}



