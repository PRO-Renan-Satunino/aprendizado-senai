#include <stdio.h>
#include <stdlib.h>

int main() {
    int salario, filhos, familias = 0, contadorSalarios = 0, totalFilhos = 0;
    int maiorSalario = 0, menorSalario = INT_MAX;
    float mediaSalarial, mediaFilhos;

    int codigo; // Definindo a vari�vel fora do loop para poder us�-la na verifica��o final.

    do {
        printf("\nCodigo | Descricao");
        printf("\n 1 | Add Pessoa");
        printf("\n 2 | Finalizar e Exibir Resultados \n");
        
        scanf("%d", &codigo);

        switch (codigo) {
            case 1: 
                printf("\nRenda Familiar: ");
                scanf("%d", &salario);
                fflush(stdin);
                
                printf("\nQuantidade de filhos: ");
                scanf("%d", &filhos);
                
                // Verificando e atualizando o maior e menor sal�rio
                if (salario > maiorSalario)
                    maiorSalario = salario;
                if (salario < menorSalario)
                    menorSalario = salario;

                // Adicionando ao total de sal�rios e filhos
                familias++;
                contadorSalarios += salario;
                totalFilhos += filhos;
                break;

            case 2:
                break;

            default:
                printf("\nOpcao invalida\n");
                system("pause");
                system("cls");
        }
    } while (codigo != 2); // Continuar at� que o c�digo seja 2

    // Calcular m�dia salarial e m�dia de filhos
    if (familias != 0) {
        mediaSalarial = (float)contadorSalarios / familias;
        mediaFilhos = (float)totalFilhos / familias;
    } else {
        mediaSalarial = 0;
        mediaFilhos = 0;
    }

    printf("\n===Exibicao de Resultados===");
    printf("\nMedia salarial do grupo: %.2f \n", mediaSalarial);
    printf("Media de filhos: %.2f\n", mediaFilhos);
    printf("Maior Salario: %d\n", maiorSalario);
    printf("Menor Salario: %d\n", menorSalario);
    printf("Familias que responderam: %d\n", familias);

    return 0;
}

