package ex04;

import java.util.Locale;
import java.util.Scanner;

public class ex04{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		int num,numPar;
		double resultado;
		System.out.println("Entre com o número: ");
		num= ler.nextInt();
		
		numPar= num%2;
		
		if(numPar==0)
		{
			if(num>0) 
			{
				resultado= Math.sqrt(num); 
				System.out.println("Raiz quadrada de "+num+" é: "+resultado);
			}
			else if(num<0)
			{
				System.out.println("ERRO!Não calculamos raiz quadrada com número negativo");
			}
			else if(num==0)
			{
				System.out.println("ERRO!Número zero é netro");
			}
			
		}
		else if(numPar!=0)
		{
			resultado= num*num;
			System.out.println("O quadrado de "+num+" é: "+resultado);
		}


}
}