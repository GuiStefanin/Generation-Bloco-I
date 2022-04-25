package Exercicio04;

public class Funcionario {
	
	String nome;
	int id;
	double salario;
	boolean apto;
	
	void trabalhar() {
		if(this.apto == false)
			System.out.println("Esse funcionário não esta apto para trabalhar");
		else
			System.out.println("Esse funcionário esta apto para trabalhar");
		    
	}
	
	void demissao() {
		this.apto = false;
	}
	
	void admissão() {
		this.apto = true;
	}
}
