package ex02;

import java.util.Scanner;
import java.util.Locale;

public class ex02{

		public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Entre com três valorores: ");
		num1= ler.nextInt();
		num2= ler.nextInt();
		num3= ler.nextInt();
			
		if(num1<=num2 && num2<=num3) 
		{
			System.out.println("1-A ordem crescente é: "+num1+" "+num2+" "+num3);
		}
		else if (num1<=num3 && num3<=num2) 
		{
			System.out.println("2-A ordem crescente é: "+num1+" "+num3+" "+num2);
		}
		else if (num2<=num1 && num1<=num3) 
		{
			System.out.println("3-A ordem crescente é: "+num2+" "+num1+" "+num3);
		}
		else if (num2<=num3 && num3<=num1) 
		{
			System.out.println("4-A ordem crescente é: "+num2+" "+num3+" "+num1);
		}
		
		else if (num3<=num1 && num1<=num2) 
		{
			System.out.println("5-A ordem crescente é: "+num3+" "+num1+" "+num2);
		}
		else 
		{
			System.out.println("6-A ordem crescente é: "+num3+" "+num2+" "+num1);
		}	
		ler.close();
		System.out.println("Fim do programa");
}
}	
