#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
    char disciplina[3][50];
    float notas[3][3];
    float media[3];
    float soma[3] = {0}; // Inicializando soma com zero
    float denominador, divisor;
    int i, j;

    // Entrada de dados
    for (i = 0; i < 3; i++) {
        printf("Digite o nome da disciplina %d: ", i+1);
        scanf("%s", disciplina[i]);

        for (j = 0; j < 3; j++) {
            // Loop para garantir que as notas inseridas sejam válidas (entre 0 e 10)
            do {
                printf("Digite a %dª Nota e o Peso: ", j+1);
                scanf("%f", &notas[i][j]);
                if (notas[i][j] < 0 || notas[i][j] > 10) {
                    printf("Nota inválida. Por favor, insira uma nota entre 0 e 10.\n");
                }
            } while (notas[i][j] < 0 || notas[i][j] > 10);

            soma[i] += notas[i][j] * (j + 1); // Acumula as notas ponderadas
        }

        // Calculando a média ponderada
        denominador = soma[i];
        divisor = 3 * 3 * 4;
        media[i] = denominador / divisor;
    }

    // Exibindo resultados
    system("cls");
    printf("===Exibindo Resultados===\n\n");
    for (i = 0; i < 3; i++) {
        printf("Média Ponderada da disciplina %s: %.2f\n", disciplina[i], media[i]);
    }

    return 0;
}

