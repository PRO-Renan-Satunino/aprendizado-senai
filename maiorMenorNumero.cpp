#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#define TAM 5

int main() {
    int vetor[TAM], maiorNumero = INT_MIN, menorNumero = INT_MAX, numeros;
    int i;
    

    printf("Digite os elementos do Vetor:\n");
    for (i = 0; i < TAM; i++) {
        printf("Elemento %d: ", i + 1);
        scanf("%d", &vetor[i]);
        
        
    if (vetor[i] < menorNumero){
    	menorNumero = vetor[i];
	} if (vetor[i] > maiorNumero) {
		maiorNumero = vetor[i];
	}
   
    }

    system("cls"); 

    printf("Elementos do Vetor:\n");
    for (i = 0; i < TAM; i++) {
        printf("Elemento %d: %d\n", i + 1, vetor[i]);
    }
    
    printf("maior numero %i", maiorNumero);
    printf("menor numero %i", menorNumero);
    

    return 0;
}

