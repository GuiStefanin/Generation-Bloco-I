package ex01;

import java.util.Scanner;
import java.util.Locale;

public class ex01{

		public static void main(String[] args)
		{
		Locale.setDefault(Locale.US);
		Scanner entrada= new Scanner(System.in);
		
		int num1=0, num2=0, num3=0;
		
		System.out.println("Entre com o primeiro valor: ");
		num1= entrada.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		num2= entrada.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		num3= entrada.nextInt();
		
		if(num1>= num2 && num1>=num3) 
		{
			System.out.println("O maior número é: "+num1);
		}
		else if(num2>= num1 && num2>=num3) 
		{
			System.out.println("O maior valor é: "+num2);
		}
		else 
		{
			System.out.println("O maior valor é: "+num3);
		}
		entrada.close();
}
}	
