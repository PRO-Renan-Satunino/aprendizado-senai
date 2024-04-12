#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define TAM 6

int main() {
	
		setlocale(LC_ALL, "Portuguese");
		
    	int numeros[TAM];
    	int pares = 0, impares = 0;

    printf("Digite 6 n�meros:\n");

    // Solicita os numeros ao usu�rio e armazena no array
    for (int i = 0; i < TAM; i++) {
        printf("N�mero %d: ", i + 1);
        scanf("%d", &numeros[i]);
        fflush(stdin);
    }

    // Verifica se cada numero � par ou �mpar e incrementa os contadores
    for (int i = 0; i < TAM; i++) {
        if (numeros[i] % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }

    // Exibe o resultado
    printf("Quantidade de n�meros pares: %d\n", pares);
    printf("Quantidade de n�meros �mpares: %d\n", impares);

    return 0;
}

