//5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int num, soma=0;
		
		do {
			System.out.print("Digite um númuero: ");
			num=leia.nextInt();
			soma = soma + num;	
		}
		while(num!=0);
		System.out.println("A soma é: "+soma);
		System.out.print("FIM DO PROGRAMA");
	}

}
