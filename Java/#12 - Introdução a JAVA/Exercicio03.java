//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
	
		Scanner leia= new Scanner(System.in);
		
		int tempoHora, tempoMinuto, tempoSegundo, tempoEvento;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		
		tempoEvento = leia.nextInt();
		
		tempoHora = tempoEvento / 3600;
		
		tempoMinuto = (tempoEvento % 3600) / 60;
		
		tempoSegundo = (tempoEvento % 3600) % 60;
		
		System.out.println("O evento durou "+tempoHora+" horas, "+tempoMinuto+" minutos e "+tempoSegundo+" segundos");
		
		
		
	
	}
}
