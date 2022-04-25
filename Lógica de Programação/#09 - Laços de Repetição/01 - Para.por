programa
{
	
	funcao inicio()
	{
		inteiro sal, filho, somaSal=0, somaFilho=0, maior=0, perSal=0
		para (inteiro x=0; x<=19; x++){
			escreva ("Digite seu Sálario: ")
			leia (sal)
			escreva ("Digite squantos filhos vc tem: ")
			leia (filho)
			somaSal = somaSal + sal
			somaFilho = somaFilho + filho
			se(sal > maior){
				maior = sal
			}
			se(sal < 100){
				perSal++
			}
		}
		escreva("A média do salário é R$ \n",somaSal/20)
		escreva("A média de filhos é \n",somaFilho/20)
		escreva("Maior salário é R$ \n",maior)
		escreva(" O percentual de pessoas com salário até R$100,00. \n",(perSal/20)*100)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */