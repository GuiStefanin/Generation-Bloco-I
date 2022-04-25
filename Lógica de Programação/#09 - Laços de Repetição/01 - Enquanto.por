programa
{
	
	funcao inicio()
	{
		real num, soma, cont
		num = 0
		soma = 0
		cont = 0
		enquanto (num >=0){
			escreva ("Digite um número: ")
			leia (num)
			se (num>=0){
				soma = soma + num
				cont++
			}	
		}
		escreva("\nSomatório: ",soma)
		escreva("\nMédia: ",soma/cont)
		escreva("\nTotal de valores: ",cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */