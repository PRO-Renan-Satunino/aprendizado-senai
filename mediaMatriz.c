#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <unistd.h>

int main (){
	setlocale(LC_ALL, "");
	
	int disciplina[3], notas[3][2], retorno = 0;
	float media[3], soma[2];
	int i, j;
	
	do{
		system("cls");
		fflush (stdin);
		for(i = 0; i<3; i++){ //matriz de disciplinas
		printf("Digite o nome da disciplina %d: ", i+1);
		scanf("%i",&disciplina[i]);
		
		
		for(j=0; j<2; j++){ //matriz de notas
				fflush (stdin);
				printf("Digite a %d? Nota: ", j+1);
				scanf("%i",&notas[i][j]);
				
				soma[i] += notas[i][j]; //contagem de notas para soma
		}
		media[i]= soma[i]/2; //calculo da media
		soma[i]= 0; //zerar soma anterior a cada execução do cód
	}
	
	//limpando console
	system ("cls");
	printf("Carregando resultados \n aguarde...");
	sleep(5); //contando 5 segundos
	system ("cls");
	
	
	//exibindo resultados
	printf("	==EXIBINDO RESULTADOS==\n\n");
	for(i=0;i<3; i++){ //matriz de disciplinas
		printf("\nDisciplina: %i", i+1, disciplina[i]);
		
		for(j=0;j<2;j++){ //matriz de notas
			printf("\n%d Nota %i",j+1,notas[i][j]);
		}
		printf("\nMédia: %.2f\n", media[i]); //exibição da média
	}
	
	 printf("\nDeseja Retornar? (S/N): ");
    scanf(" %c",&retorno); // Corrigido para %c e adicionado espaço antes do %c
        
    } while (retorno != 'N' && retorno != 'n'); //o codigo repetirá até ser digitado "Não"
	
	return 0;

}

