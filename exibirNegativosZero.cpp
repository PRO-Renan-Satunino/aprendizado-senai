#include <stdio.h>
#define TAM 5
#include <limits.h>
#include <locale.h>

int main (){
	setlocale (LC_ALL, "portuguese");
	
	float numeros[TAM];
	int i;
	
	printf("Insira os dados a seguir\n");
	
	for (i = 0; i<TAM; i++){
		printf("Digite aqui o %i� numeros: ", i+1);
		scanf("%f", &numeros[i]);
		
		
		if (numeros[i] < 0){
			numeros[i] = 0;
		}
	}
	
	printf("Exibindo Resultados \n");
	for (i = 0; i<TAM; i++){
		printf("\nO %i�: %.1f", i+1, numeros[i]);
}
}
