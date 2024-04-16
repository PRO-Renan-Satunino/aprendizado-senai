#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main (){
	setlocale (LC_ALL, "portuguese");
	
	
	int numeros[2][2]; 
	int i, j;
	
	//definindo valores das matrizes
	numeros	[1][2] = 3;
	numeros	[0][0] = 0;
	numeros [1][0] = 1;
	numeros [1][1] = 2;
	numeros [2][2] = 4;
	
	
		printf("Selecione uma combinação com 1 e 2 de até 2 digitos\n");
		//inicio do laço para o usuario definir os valores da matriz
	for (i=0; i<2; i++)	{
		for(j=0;j<2;j++){
			printf("\nElemento da Linha %d coluna %d: ", i+1, j+1);
			scanf("%d",&numeros[i][j]);
		}
	}
	system ("clear || cls"); //dando uma limpada no console
	
	//exibição de valores
	for (i=0; i<2;i++){
		for(j=0;j<2;j++){
			printf("\nElemento da linha %d coluna %d %d\n", i+1, j+1, numeros[i][j]);
	}
}
		
	
}
