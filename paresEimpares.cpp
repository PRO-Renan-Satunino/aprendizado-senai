#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TAM 6

int main() {
	
		setlocale(LC_ALL, "Portuguese");
		
    	int numeros[TAM];
    	int pares = 0, impares = 0;

    printf("Digite 6 números:\n");

    // Solicita os numeros ao usuário e armazena no array
    for (int i = 0; i < TAM; i++) {
        printf("Número %d: ", i + 1);
        scanf("%d", &numeros[i]);
        fflush(stdin);
    }

    // Verifica se cada numero é par ou ímpar e incrementa os contadores
    for (int i = 0; i < TAM; i++) {
        if (numeros[i] % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }

    // Exibe o resultado
    printf("Quantidade de números pares: %d\n", pares);
    printf("Quantidade de números ímpares: %d\n", impares);

    return 0;
}

