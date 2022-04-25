//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99

package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		int idade, cont1=0, cont2=0;
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if (idade < 21)
				cont1++;
			if (idade > 50)
				cont2++;
			
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("São "+cont1+" pessoas com menos de 21 anos e "+cont2+" pessoas com mais de 50 anos");
		System.out.println("FIM DO PROGRAMA");
	}

}
