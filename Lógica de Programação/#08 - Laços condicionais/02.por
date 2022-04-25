programa
{
	
	funcao inicio()
	{
		inteiro c, n, E
		escreva ("Insira o código e número de horas trabalhadas\n")
		leia (c, n)
		se ( n < 50){
			E = 0
			escreva ("Sálario total de R$",n*10,"\nSálario excedente R$0")
		}
		senao {
			E = n-50
			escreva ("Sálario total de R$500","\nSálario excedente R$",E*20)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */