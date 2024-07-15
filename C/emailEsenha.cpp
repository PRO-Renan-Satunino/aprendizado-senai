#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char email[50];
    char senha[20];
    char emailDefinido[50];
    char senhaDefinida[20];

    printf("Defina seu e-mail: ");
    scanf("%s", email);

    printf("Defina sua senha: ");
    scanf("%s", senha);

 	    	system("cls");
    	   

    do {
    

        printf("Digite seu e-mail: ");
        scanf("%s", emailDefinido);

        printf("Digite sua senha: ");
        scanf("%s", senhaDefinida);
        
        if (strcmp(emailDefinido, email) != 0 || strcmp(senhaDefinida, senha) != 0){
        	printf("==Acesso Negado==\n\n");
		}
		
    } while (strcmp(emailDefinido, email) != 0 || strcmp(senhaDefinida, senha) != 0);
    
    system("cls");
    	   
	printf("\n==Acesso Concedido==");

    return 0;
}

