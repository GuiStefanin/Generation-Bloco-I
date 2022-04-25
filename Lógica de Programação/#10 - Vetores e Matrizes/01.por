programa
{
	
	funcao inicio()
	{
		inteiro num[5], maior=0, x
		para(x=0;x<=4;x++){
			escreva ("Digite a pontuação: ")
			leia(num[x])
			se(num[x]>maior){
				maior = num[x]
			}
		}
		para(x=0;x<=4;x++){
			escreva (num[x]," ")
		}
		escreva ("\nA maior pontuação é: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */