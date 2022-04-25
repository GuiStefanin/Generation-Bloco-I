programa
{
	
	funcao inicio()
	{
		real P, E, M
		escreva ("Entre com o peso\n")
		leia (P)
		E = 0
		M = 0
		se (P > 50) {
			E = P - 50
			M = E*4
			escreva ("R$",M," de multa")
		}
		senao{
			escreva ("Sem multa")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 44; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */