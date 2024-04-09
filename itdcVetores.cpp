#include <stdio.h>
#include <stdlib.h>

int main (){ 

	int vetor[10];
	int i;
	
	printf("Digite os elementos do Vetor: \n");
	for (i = 0; i<10; i++) {
		printf("Elemento %d: ", i + 1);
		scanf("%d", &vetor[i]);
	}
	
	system ("cls");
	
	for (i = 0; i<10; i++) {
		printf("Elemento %d: %d\n", i+1, vetor[i]);
	}
	
	return 0;
	}
