#include <stdio.h>

#define NUM_PESSOAS 5

int main() {
    char nomes[NUM_PESSOAS][50]; // Array para armazenar os nomes das pessoas
    int idades[NUM_PESSOAS];     // Array para armazenar as idades das pessoas
    
    // Solicita o nome e a idade de 5 pessoas
    for (int i = 0; i < NUM_PESSOAS; i++) {
        printf("Digite o nome da pessoa %d: ", i + 1);
        scanf("%s", nomes[i]);
        fflush(stdin);
        
        printf("Digite a idade da pessoa %d: ", i + 1);
        scanf("%d", &idades[i]);
    }
    
    // Lista os nomes e as idades das pessoas
    printf("\nLista de pessoas:\n");
    for (int i = 0; i < NUM_PESSOAS; i++) {
        printf("Nome: %s, Idade: %d\n", nomes[i], idades[i]);
    }
    
    return 0;
}

