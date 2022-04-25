package Exercicio02;

import Exercicio02.Avião;

public class TesteAvião {
	
	public static void main(String[] args) {
		
		Avião x = new Avião ();
		
		x.modelo = "Airbus Stefanin";
		x.numPassageiros = 300;
		x.preçoPassagem = 15000;
		x.turbina = false;
		
		x.voo();
		
		if(x.turbina == true) 
			System.out.println("O "+x.modelo+" esta decolando com "+x.numPassageiros+" passageiros e com a pasagem a R$"+x.preçoPassagem+". Tenham uma boa viagem!");
	}

}
