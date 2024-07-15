#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main (){
	setlocale(LC_ALL, "");
	
	int banda[3], integrantes[3][5];
	int i, j;
	
	for(i=0;i<3;i++){
		printf("\nDigite o nome da %d Banda: ", i+1);
		scanf("%i",&banda[i]);
		fflush(stdin);
		
		for(j=0;j<5;j++){
			printf("Digite o nome do %d Integrante: ", j+1);
			scanf("%i",&integrantes[i][j]);
			fflush(stdin);
		}
	}
}
