#include <stdio.h>
#include <locale.h>

#define TAM 5

int main() {
    setlocale(LC_ALL, "portuguese");

    int numeros, pares = 0, impares = 0, positivo = 0, negativo = 0, quantInserida = 0;
    int quantiPar = 0, quantiImpar = 0, quantiPositivo = 0, quantiNegativo = 0;
    int i;
	
	while(numeros != 0){
		//insert
		fflush(stdin);
        printf("Insira um numero: ");
        scanf("%i", &numeros);
        

        //condicoes e definicoes
        if (numeros % 2 == 0) {
            pares++;
            quantiPar++;
        } else {
            impares++;
            quantiImpar++;
        }

        if (numeros < 0) {
            negativo++;
            quantiNegativo++;
        } else {
            positivo++;
            quantiPositivo++;
        }

        //contar insert
        quantInserida++;
		
	} 
   
        
     //fim do while

    //exibindo resultados
    printf("===Exibindo resultados===\n\n");
    printf("\nQuantidade de Pares: %i", quantiPar);
    printf("\nQuantidade de Ímpares: %i", quantiImpar);
    printf("\nQuantidade de Positivos: %i", quantiPositivo);
    printf("\nQuantidade de Negativos: %i", quantiNegativo);
    printf("\nQuantidade de Valores Inseridos: %i", quantInserida);

    return 0;
}

