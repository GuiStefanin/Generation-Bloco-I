package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double numero, soma, contador;
		soma =0;
		contador=0;
		Scanner leia = new Scanner(System.in);
	
		do {
		System.out.print("Digite o n�mero: ");
		numero = leia.nextDouble();
			if (numero%3==0 && numero!=0) {
		
			soma = soma + numero;
			contador++;  
			}
		}
		while (numero!=0 );
		System.out.print("A m�dia dos n�meros �: " +soma/contador );
		

	}

}
