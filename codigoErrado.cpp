#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

#define TAM 6

int main (){
	setlocale (LC_ALL, "portuguese");
	
	int numero[TAM];
	
	//fazendo cera pro usuario esperar
	printf("Iniciando Programa...");
	system ("cls");
	
	for (int i = 0; i < TAM; i++){
		do {
			printf("Insira o %iº valor: ", i+1);
			scanf ("%i", &numero[i]);
		} while (numero[i] % 2 != 0 || numero[i] < 0 || numero[i] != (int)numero[i]);
	}
	
	return 0;
}

