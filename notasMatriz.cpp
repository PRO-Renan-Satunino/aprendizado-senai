#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main (){
	
	int disciplina[3], notas[3][2];
	float media[3], soma[2];
	int i, j;
	
	for(i = 0; i<3; i++){
		printf("Digite o nome da disciplina %d: ", i+1);
		scanf("%i",&disciplina[i]);
		fflush (stdin);
		
		for(j=0; j<2; j++){
				printf("Digite a %dª Nota: ", j+1);
				scanf("%i",&notas[i][j]);
				
				soma[i] += notas[i][j];
		}
		media[i]= soma[i]/3;
		soma[i]= 0;
	}
	system ("cls");
	printf("Carregando resultados \n aguarde...");
	sleep(5);
	
	
	printf("	==EXIBINDO RESULTADOS==\n\n");
	
	for(i=0;i<3; i++){
		printf("Disciplina: ", i+1, disciplina[i]);
		
		for(j=0;j<2;j++){
			printf("\n%d Nota",j+1,notas[i][j]);
		}
	}
	printf("");
	
	return 0;
}

