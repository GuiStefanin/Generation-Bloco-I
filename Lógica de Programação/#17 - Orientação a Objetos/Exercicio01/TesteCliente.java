package Exercicio01;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente x = new Cliente();
		
		x.nome = "Stefanin";
		x.cpf = 123456789;
		x.valorCompra = 99.99;
		x.compraEfetivada = true;
		
		x.comprar();
		
		if(x.compraEfetivada == true) 
			System.out.println("O cliente "+x.nome+" com CPF "+x.cpf+" realizaou uma compra no valor de "+x.valorCompra);

}


}
