#include <stdio.h>
#include <stdlib.h>

int main (){
	
	int valor, somaGeral = 0, somaPares = 0, contadorGeral = 0;
	int pares = 0, impares = 0;
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
	}
	
	return 0;
	 
	
}
