#include <stdio.h>
#include <stdlib.h>

#define TAM 4

int main() {
    int vetor[TAM];
    int i;
    float media = 0;

    printf("Digite os elementos do Vetor:\n");
    for (i = 0; i < TAM; i++) {
        printf("Elemento %d: ", i + 1);
        scanf("%d", &vetor[i]);
    }

    system("cls"); 

    // Calculando a média
    for (i = 0; i < TAM; i++) {
        media += vetor[i];
    }
    media /= TAM;

    printf("Elementos do Vetor:\n");
    for (i = 0; i < TAM; i++) {
        printf("Elemento %d: %d\n", i + 1, vetor[i]);
    }
    
    if (media >= 7){
    	printf("Aprovado!\n");
	} else if (media >= 5) {
		printf("Recuperacao\n");
	} if (media < 5) {
		printf("Reprovado\n");
	}

    printf("Media: %.2f\n", media);

    return 0;
}

