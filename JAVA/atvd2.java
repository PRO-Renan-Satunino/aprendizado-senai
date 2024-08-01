import java.util.Scanner;

public class atvd2 {

    public static void main(String[] args) {
        // declarando variaveis
        int a;
        int b;
        int maior, menor;

        // pedindo valores
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        a = teclado.nextInt();

        System.out.println("Insira o valor de B: ");
        b = teclado.nextInt();

        // ifi & elzy
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        if (a < b) {
            menor = a;
        } else {
            menor = b;
        }

        System.out.println("Maior Numero: " + maior);
        System.out.println("Menor Numero: " + menor);

        teclado.close();
    }
}
