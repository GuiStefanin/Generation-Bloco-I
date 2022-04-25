package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		double a, b, c, d, e, f, g, x, y;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println(" Digite os coeficientes a, b, c, d, e, f: ");
		
		a = leia.nextDouble(); 
		b = leia.nextDouble();
		c = leia.nextDouble();
		d = leia.nextDouble();
		e = leia.nextDouble();
		f = leia.nextDouble();
		
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		
	}

}
