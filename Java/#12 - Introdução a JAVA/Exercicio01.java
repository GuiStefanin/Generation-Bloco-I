//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int idadeAno, idadeMes, idadeDia, diasDeVida;
		
		System.out.println("Digite sua idade no formato aa mm dd: ");
		
		idadeAno = leia.nextInt();
		idadeMes = leia.nextInt();
		idadeDia = leia.nextInt();
		
		diasDeVida = idadeAno*365 + idadeMes*30 + idadeDia;
				
		System.out.println("Você tem "+diasDeVida+" dias de vida");
	}
}
