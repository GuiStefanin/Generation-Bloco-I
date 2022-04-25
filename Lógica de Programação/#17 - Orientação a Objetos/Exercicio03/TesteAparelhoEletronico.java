package Exercicio03;

public class TesteAparelhoEletronico {
	
	public static void main(String[] args) {
		
		ProdutoEletronico x = new ProdutoEletronico();
		
		x.marca = "Stefanin Tech";
		x.bateria = 75;
		x.versao = 2.7;
		x.ligado = true;
		
		x.usar();
		
		if(x.ligado == true) 
			System.out.println("O aparelho "+x.marca+" esta com "+x.bateria+"% de bateria e se encontra na versão "+x.versao);
		
	}

}
