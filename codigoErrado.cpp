#include <stdio.h>
#include <locale.h>
#include <time.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>


int main (){
	setlocale (LC_ALL, "portuguese");
	
	float numero[4];
	int i, pares, impares;
	
	//fazendo cera pro usuario esperar
	printf("Iniciando Programa...");
	system ("cls");
	
	
	for ( i=0; i < 4; i++) {
		do {
			printf("Insira o %iº valor: ", i+1);
			scanf ("%i",&numero[i]);
			
			if (numero[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
		} while (numero != pares || numero < 0);
	}
	
	return 0;
}
