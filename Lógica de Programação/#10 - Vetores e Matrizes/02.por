programa {

	funcao inicio() {

		inteiro num[10], maiorNum = 0, cont = 0
		real soma = 0.0, media = 0.0

		para(inteiro x = 0; x <= 9; x++) {
			escreva("Entre com um valor: ")
			leia(num[x])
			soma = soma + num[x]
				se (num[x] >= maiorNum) {
					se (num[x] > maiorNum) {
						cont = 1
					}
					se (num[x] == maiorNum) {
						cont ++
					}
				maiorNum= num[x]
				}
			}	
		para (inteiro x = 0; x <= 9; x++) {
			escreva(num[x] + " ")
		}
		media = soma / 10 
		escreva("\nA média é igual a " + media)
		escreva("\nE o maior número foi " + maiorNum + ", " + cont + " vezes")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */