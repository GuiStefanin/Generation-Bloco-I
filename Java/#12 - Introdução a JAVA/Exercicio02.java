//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int idadeAno, idadeMes, idadeDia, diasDeVida;
		
		System.out.println("Digite sua idade expressa em dias: ");
		
		diasDeVida = leia.nextInt();
		
		idadeAno = diasDeVida / 365;
		
		idadeMes = (diasDeVida % 365) / 30;
		
		idadeDia = (diasDeVida % 365) % 30;
		
		System.out.println("Sua idade é "+idadeAno+" anos, "+idadeMes+" meses e "+idadeDia+" dias");

	}

}
