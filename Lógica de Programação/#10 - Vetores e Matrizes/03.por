programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], y, x
		para(x = 0; x<4;x++){
			para(y= 0; y<6;y++){
				escreva("digite o valor da linha " +(x+1) + " e coluna " + (y+1) +" da 1º matriz: ")
				leia(n1[x][y])
				escreva("digite o valor da linha " +(x+1) + " e coluna " + (y+1) +" da 2º matriz: ")
				leia(n2[x][y])
				m1[y][x]= n1[x][y] + n2[x][y]
				m2[x][y]= Matematica.valor_absoluto( n1[x][y] - n2[x][y])
			}}
			escreva("A 1º matriz é:\n")
			para(x= 0; x<4;x++){
				para(y= 0; y<6;y++){
					escreva(n1[x][y] + "|")}
			escreva("\n")
					}
			escreva("\nA 2º matriz é:\n")
			para(x= 0; x<4;x++){
				para(y= 0; y<6;y++){
					escreva(n2[x][y] + "|")}
			escreva("\n")
					}
			escreva("\nA soma da matriz 1 e 2 é:\n")
			para(x= 0; x<4;x++){
				para(y= 0; y<6;y++){
					escreva(m1[x][y] + "|")}
			escreva("\n")
					}
			escreva("\nA subtração da matriz 1 e 2 é:\n")
			para(x= 0; x<4;x++){
				para(y= 0; x<6;x++){
					escreva(m2[x][y] + "|")}
			escreva("\n")
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 992; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */