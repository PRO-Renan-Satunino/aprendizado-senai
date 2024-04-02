#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main (){
	
	int valor, somaGeral = 0, somaPares = 0, contadorGeral = 0;
	int pares = 0, impares = 0, menorNumero = INT_MAX, maiorNumero = INT_MIN;
	float mediaGeral, mediaPares;
	
	printf("Escreva algum número: ");
	scanf("%i", &valor);
	
	while (valor != 0) {
		if (valor > 0) {
			contadorGeral ++;
			somaGeral += valor;
			
			if (valor % 2 == 0) {
				//pares = pares + 1
				pares++;
				
				//somaPares = somaPares + valor;
				somaPares += valor;
			} else {
				impares++;
			}
			
			if (valor > maiorNumero) {
				maiorNumero = valor;
			}
			
			if ( valor < menorNumero) {
				menorNumero = valor;
			}
		}
		printf("Digite um numero: ");
		scanf("%i", &valor);
		fflush(stdin);
	}
	
	if (contadorGeral == 0) {
		printf(" Nao foi informado um numero positivo.");
	} else {
		// cast
		//2 -> 2.0
		mediaGeral = somaGeral / (float) contadorGeral;
		mediaPares = somaPares / (float) pares;
	
		printf("Quantidade de Pares: %i \n", pares);
		printf("Quantidade de impares: %i \n", impares);
		printf("Media Geral: %.1f \n", mediaGeral);
		printf("Media de numeros pares: %.1f \n", mediaPares);	
		printf("\nMaior Numero: %i", maiorNumero);
		printf("\nMenor Numero: %i", menorNumero);
	
	}
	
	return 0;
	 
	
}
