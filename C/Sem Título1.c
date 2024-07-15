#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <time.h>
#include <ctype.h>

int main (){
	
	int idade = 0, menorIdade = INT_MAX, maiorIdade = INT_MIN, contadorSalarios = 0;
	int mulheres5k = 0, codigo;
	char sexo;
	float salario, somaSalario, mediaSalarial = 0;
	
	do {
		printf("\nCodigo | 	Descricao");
	    printf("\n 1  |	Add Pessoa");
	    printf("\n 2  |	Finalizar e Exibir Resultados \n");
	    scanf("%i", &codigo);
	
    switch (codigo) {
    	case 1: 
		    printf("\nQuantos anos voce tem?: ");
			scanf("%i",&idade);
			fflush(stdin);
				
			printf("\nQual seu sexo (M/F): ");
			scanf("%c",&sexo);
		
			printf("\nQuanto voce ganha: ");
			scanf("%f",&salario);
			fflush(stdin);
			
	if (idade < menorIdade) {
		menorIdade = idade;
	} else {
		maiorIdade = idade;
	}
			
		somaSalario += salario;
        contadorSalarios++;
	
	if (sexo == 'F' && salario >= 5000) {
		mulheres5k++;
	}
	break;
		case 2:
			break;
		default:
			printf("\nopcao invalida\n");
			sleep(4);
			system ("cls");
	}
} while (codigo != 2);

	mediaSalarial = contadorSalarios / salario;
			
	printf("===Exibicao de Resultados===");
	printf("\nMedia salarial do grupo: %.2f \n", mediaSalarial);
	printf("\nMaior Idade: %i ", maiorIdade);
	printf("\nMenor Idade: %i ", menorIdade);
	printf("\nQuantidade de mulieres com +5K: %i ", mulheres5k);
	
	return 0;
    
	}
	
				

	
	


    	

	
	
	

			
		
	


	

	

