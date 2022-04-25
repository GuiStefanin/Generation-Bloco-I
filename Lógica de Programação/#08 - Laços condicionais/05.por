programa
{
	
	funcao inicio()
	{
		real indice
		escreva ("Insira o indice de poluição\n")
		leia (indice)
		se (indice >= 0.3 e indice < 0.4){
			escreva ("Suspender as atividades das industrias do 1º grupo")
		}
		senao se (indice >= 0.4 e indice < 0.5){
			escreva ("Suspender as atividades das industrias do 1º e 2º grupo")
		}
		senao se (indice >= 0.5){
			escreva ("Suspender as atividades das industrias de todos os grupos")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */