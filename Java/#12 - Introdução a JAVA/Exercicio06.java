//Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:

package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		double x1, x2, y1, y2, d, a, b;
		
		System.out.println(" Digite as coordenadas de P(x1,y1): ");
		
		x1 = leia.nextDouble();
		y1 = leia.nextDouble();
		
		System.out.println(" Digite as coordenadas de P(x2,y2): ");
		
		x2 = leia.nextDouble();
		y2 = leia.nextDouble();
		
		a = Math.pow((x2-x1), 2);
		b = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(a+b);
		
		System.out.println("A distencia é: "+d);
		
	}
}
