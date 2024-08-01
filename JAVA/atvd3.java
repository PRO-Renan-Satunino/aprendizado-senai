import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double[] notas = new double[3];
        double media = 0;
        int i;

        // Entrada do nome
        System.out.println("Nome do Aluno: ");
        nome = teclado.next();

        // Entrada das notas
        for (i = 0; i < 3; i++) {
            System.out.printf("Digite a nota da %dª Unidade: ", i + 1);
            notas[i] = teclado.nextDouble();
        }

        // Cálculo da média
        for (i = 0; i < 3; i++) {
            media += notas[i];
        }
        media /= 3;

        // Exibindo Resultados
        for (i = 0; i < 3; i++) {
            System.out.printf("Sua nota da %dª Unidade: %.2f%n", i + 1, notas[i]);
        }
        System.out.printf("Sua média do ano: %.2f%n", media);

        // Reprovando o aluno se a média for menor que 6
        if (media < 6) {
            System.out.println(nome + " foi reprovado.");
        } else {
            System.out.println(nome + " foi aprovado.");
        }

        teclado.close();
    }
}
