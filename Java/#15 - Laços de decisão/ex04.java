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
		System.out.println("Entre com o n�mero: ");
		num= ler.nextInt();
		
		numPar= num%2;
		
		if(numPar==0)
		{
			if(num>0) 
			{
				resultado= Math.sqrt(num); 
				System.out.println("Raiz quadrada de "+num+" �: "+resultado);
			}
			else if(num<0)
			{
				System.out.println("ERRO!N�o calculamos raiz quadrada com n�mero negativo");
			}
			else if(num==0)
			{
				System.out.println("ERRO!N�mero zero � netro");
			}
			
		}
		else if(numPar!=0)
		{
			resultado= num*num;
			System.out.println("O quadrado de "+num+" �: "+resultado);
		}


}
}