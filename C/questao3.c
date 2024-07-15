#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    char nome[50];
    int idade, opcao;
    char email[50];
    char telefone[15];

    printf("Digite o nome: ");
    scanf("%s", nome);
    printf("Digite a idade: ");
    scanf("%d", &idade);
    printf("Digite o email: ");
    scanf("%s", email);
    printf("Digite o telefone: ");
    scanf("%s", telefone);
    
    system("clear");
    printf("Dados coletados com sucesso!\n");
    sleep(3);

 
    do {
        system("clear");
        printf("\nEscolha uma opcao:\n");
        printf("1 - Nome e idade\n");
        printf("2 - Nome e email\n");
        printf("3 - Nome e telefone\n");
        printf("4 - Mostrar tudo\n");
        printf("0 - Encerrar o programa\n");
        printf("Opcao: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
            system("clear");
                printf("Nome: %s\n", nome);
                printf("Idade: %d\n", idade);
                break;
            case 2:
            system("clear");
                printf("Nome: %s\n", nome);
                printf("Email: %s\n", email);
                break;
            case 3:
            system("clear");
                printf("Nome: %s\n", nome);
                printf("Telefone: %s\n", telefone);
                break;
            case 4:
            system("clear");
                printf("Nome: %s\n", nome);
                printf("Idade: %d\n", idade);
                printf("Email: %s\n", email);
                printf("Telefone: %s\n", telefone);
                break;
            case 0:
            system("clear");
                printf("Encerrando o programa...\n");
                return 0; // Encerra o programa imediatamente
            default:
                system("cls || clear"); // Limpa o console
                printf("Opcao invalida! Escolha novamente.\n");
        }
    } while (opcao < 0 || opcao > 4); // Repete enquanto opcao for inválida

    return 0;
}
