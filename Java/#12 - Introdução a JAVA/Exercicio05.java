//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.

package Exercicio05;

import java.util.Scanner;

public class Exercio05 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Digite as 3 notas: ");
		
		n1= leia.nextDouble();
		n2= leia.nextDouble();
		n3= leia.nextDouble();
		
		media = (n1*2 + n2*3 + n3*5) / 10;
		
		System.out.println("A m�dia final �: "+media);
		

	}

}
