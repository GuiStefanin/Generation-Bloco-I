package Exercicio04;

public class Funcionario {
	
	String nome;
	int id;
	double salario;
	boolean apto;
	
	void trabalhar() {
		if(this.apto == false)
			System.out.println("Esse funcion�rio n�o esta apto para trabalhar");
		else
			System.out.println("Esse funcion�rio esta apto para trabalhar");
		    
	}
	
	void demissao() {
		this.apto = false;
	}
	
	void admiss�o() {
		this.apto = true;
	}
}
