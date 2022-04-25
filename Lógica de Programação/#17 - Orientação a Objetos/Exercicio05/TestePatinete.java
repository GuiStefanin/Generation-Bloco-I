package Exercicio05;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete x = new Patinete();
		
		x.cor = "Cinza";
		x.numRodas = 2;
		x.aguenta = 78.9;
		x.anda = true;
		
		x.Andar();
		
		if(x.anda == true) 
			System.out.println("O Patinete tem cor "+x.cor+" possui "+x.numRodas+" rodas e aguenta"+x.aguenta);
	}
}
