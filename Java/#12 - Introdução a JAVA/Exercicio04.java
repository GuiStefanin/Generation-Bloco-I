//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:

package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		int a, b, c, r, s, d;
		
		System.out.println("Digite 3 n�meros inteiros e positivos: ");
		
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r+s)/2;
				
		
	}
}
