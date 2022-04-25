package Exercicio04;

public class testeFuncionario {
 
	public static void main(String[] args) {
		
		Funcionario x = new Funcionario();
		
		x.nome = "Guilherme";
		x.id = 234;
		x.salario = 2400;
		
		x.trabalhar();
		
		if(x.apto == true) 
			System.out.println("O funcionario "+x.nome+" com a ficha "+x.id+" recebe salario de R$"+x.salario);
	}
}
