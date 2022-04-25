//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		double custoConsumidor, custoFabrica;
		
		System.out.println("Entre com o custo de fábrica: ");
		
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.45;
		
		System.out.println("O custo ao consumidor é: "+custoConsumidor);
		
		
	}

}
