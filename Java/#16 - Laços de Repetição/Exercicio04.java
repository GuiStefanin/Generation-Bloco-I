package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
				int idade, x=0, sexo,  psico, cont1 =0, cont2 =0, cont3 =0, cont4 =0, cont5 =0, cont6 =0;
				Scanner leia = new Scanner(System.in);
				
				    while(x<2) { 
					System.out.print("Digite sua idade: ");
					idade = leia.nextInt();
					
					System.out.print("Digite seu sexo: ");
					sexo = leia.nextInt();
					
					System.out.print("Digite sua caracteristica psicol�gica: ");
					psico = leia.nextInt();
					
					if (psico==1)
						cont1++;
					
					if (sexo==1 && psico==2)
						cont2++;
					
					if (sexo==2 && psico==3)
						cont3++;
					
					if (sexo==3 && psico==1)
						cont4++;
					
					if (idade>40 && psico==2)
						cont5++;
					
					if (idade<18 && psico==1)
						cont6++;
					
					x++;
					
				}
				System.out.println("o n�mero de pessoas calmas �: " +cont1);
				System.out.println("o n�mero de mulheres nervosas �: " +cont2);
				System.out.println("o n�mero de homens agressivos �: " +cont3);
				System.out.println("o n�mero de outros calmos �: " +cont4);
				System.out.println("o n�mero de pessoas nervosas com mais de 40 anos �: " +cont5);
				System.out.println("o n�mero de pessoas calmas com menos de 18 anos �: " +cont6);
	}
}
