#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <unistd.h>

int main (){
	setlocale(LC_ALL, "portuguese");
	
	int disciplina[3], notas[3][2];
	float media[3], soma[2];
	int i, j;
	
	for(i = 0; i<3; i++){
		printf("Digite o nome da disciplina %d: ", i+1);
		scanf("%i",&disciplina[i]);
		fflush (stdin);
		
		for(j=0; j<2; j++){
				printf("Digite a %d? Nota: ", j+1);
				scanf("%i",&notas[i][j]);
				
				soma[i] += notas[i][j];
		}
		media[i]= soma[i]/2;
		soma[i]= 0;
	}
	
	system ("cls");
	printf("Carregando resultados \n aguarde...");
	sleep(5);
	system ("cls");
	
	
	printf("	==EXIBINDO RESULTADOS==\n\n");
	
	for(i=0;i<3; i++){
		printf("\nDisciplina: %i", i+1, disciplina[i]);
		
		for(j=0;j<2;j++){
			printf("\n%d Nota %i",j+1,notas[i][j]);
		}
		printf("\nMédia: %.2f\n", media[i]);
	}
	printf("");
	
	return 0;
}

