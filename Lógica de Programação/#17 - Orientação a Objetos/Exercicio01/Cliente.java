package Exercicio01;

public class Cliente {

	String nome;
	int cpf;
	double valorCompra;
	boolean compraEfetivada;
	
	void comprar() {
		if(this.compraEfetivada == true)
			System.out.println("Compra realizada com sucesso");
		else
			System.out.println("Falha ao realizar a compra");
		    
	}
}
