package Exercicio02;

import Exercicio02.Avi�o;

public class TesteAvi�o {
	
	public static void main(String[] args) {
		
		Avi�o x = new Avi�o ();
		
		x.modelo = "Airbus Stefanin";
		x.numPassageiros = 300;
		x.pre�oPassagem = 15000;
		x.turbina = false;
		
		x.voo();
		
		if(x.turbina == true) 
			System.out.println("O "+x.modelo+" esta decolando com "+x.numPassageiros+" passageiros e com a pasagem a R$"+x.pre�oPassagem+". Tenham uma boa viagem!");
	}

}
