#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    
    char disciplina[3][50];
    float notas[3][3];
    float media[3];
    int pesos[3];
    float soma[3] = {0};
    float denominador, divisor;
    int i, j;

    // Coleta de dados
    for (i = 0; i < 3; i++) {
        printf("Digite o nome da disciplina %d: ", i+1);
        scanf("%s", disciplina[i]);
        fflush(stdin);

        printf("Digite o peso da nota 1 (0 a 10): ");
        scanf("%d", &pesos[0]);
        printf("Digite o peso da nota 2 (0 a 10): ");
        scanf("%d", &pesos[1]);
        printf("Digite o peso da nota 3 (0 a 10): ");
        scanf("%d", &pesos[2]);

        for (j = 0; j < 3; j++) {
            // Loop pra receber notas apenas entre 0 e 10
            do {
                printf("Digite a %d� Nota: ", j+1);
                scanf("%f", &notas[i][j]);
                if (notas[i][j] < 0 || notas[i][j] > 10) {
                    printf("Nota inv�lida. Por favor, insira uma nota entre 0 e 10.\n");
                }
            } while (notas[i][j] < 0 || notas[i][j] > 10);

            soma[i] += notas[i][j] * pesos[j]; // calculo de nota e pesos
        }

        // Calculando a m�dia ponderada
        denominador = soma[i]; //definicao do denominador
        divisor = pesos[0] + pesos[1] + pesos[2]; // Somando os pesos
        media[i] = denominador / divisor; //calculo final
    }

    // Exibindo resultados
    system("cls");
    printf("===Exibindo Resultados===\n\n");
    for (i = 0; i < 3; i++) {
        printf("M�dia Ponderada da disciplina %s: %.2f\n", disciplina[i], media[i]);
    }

    return 0;
}

