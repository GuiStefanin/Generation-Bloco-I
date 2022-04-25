programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real num1, num2, num3, num4, q1, q2, q3, q4
		escreva ("Insira 4 números\n")
		leia (num1, num2, num3, num4)
		q1 = mat.potencia(num1,2)
		q2 = mat.potencia(num2,2)
		q3 = mat.potencia(num3,2)
		q4 = mat.potencia(num4,2)
		se (q3 >= 1000){
			escreva (q3)
		}
		senao{
			escreva ( num1," ",q1,"\n",num2," ", q2,"\n",num3," ",q3,"\n",num4," ",q4,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */