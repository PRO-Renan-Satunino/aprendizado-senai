#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

#define TAM 6

int main (){
    setlocale (LC_ALL, "portuguese");
    
    int numero[TAM];
    int i;
    
    // Solicita 6 números pares ou inteiros
    for (i = 0; i < TAM;){
        printf("Insira o %iº valor (par ou inteiro): ", i+1);
        scanf ("%i", &numero[i]);
        
        // Verifica se o número é par ou inteiro
        if (numero[i] % 2 == 0 || numero[i] >= 0) {
            i++; // Incrementa apenas se for par e positivo
        } else {
            printf("Número inválido. Insira um número par ou inteiro positivo.\n");
        }
    }
    
    // Exibição dos números em ordem invertida
    printf("\n	===Exibindo Resultados===\n\n");
    for(i = TAM - 1; i >= 0; i--){
        printf("%iº valor: %i\n", TAM - i, numero[i]);
    }
    
    return 0;
}

