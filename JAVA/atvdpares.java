import java.util.Scanner;

public class atvdpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1-Numeros Impares");
            System.out.println("2-Numeros Pares");
            System.out.println("3-Tabuada de 1 a 10");
            System.out.println("4-Escolher Tabuada");
            System.out.println("5-Numeros de 10 a 20");
            System.out.println("6-Numeros de 20 a 10");
            System.out.println("7-Numeros multiplos de 3");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    //numeros impares
                    System.out.println("Exibindo numeros imapares de 1 a 51: ");
                    for (int i=1; i<= 51; i +=2) {
                        System.out.println(i);
                    }
                break;
                case 2:
                    //numeros pares
                    System.out.println("\nNumeros pares de 52 a 100: ");
                    for (int i=52; i<=100; i+=2) {
                        System.out.println(i);
                    }
                break;
                case 3:
                    //tabuada
                    for (int i = 1; i<=10; i++) {
                        System.out.println("Tabuada do " + i + ":");
                        for (int j=1; j<=10; j++) {
                            System.out.println(i+" x " + j + " = " + (i*j));
                        }
                        System.out.println();
                    }
                break;
                 case 4:
                    //tabuada do numero inserido
                    System.out.println("Digite um numero para ver a tabuada condizente: ");
                    int num = sc.nextInt();

                    for (int j = 1; j <= 10; j++) {
                        System.out.println(num + " x " + j + " = " + (num * j));
            }
                break;

                case 5:
                    //Numeros de 10 a 20
                    System.out.println("Numeros de 10 a 20: ");
                    for (int i=10; i<= 20; i++) {
                        System.out.println(i);
                    }
                break;
                
                case 6: 
                    //Numero de 20 a 10
                    System.out.println("Numeros de 20 a 10: ");
                    for (int i=20; i>= 10; i--) {
                        System.out.println(i);
                    }
                break;

                case 7: 
                    //Multiplos de 3
                    int multiplos = 0;
                    for (int i = 1; i<= 100; i++) {
                        if (i%3 == 0) {
                            multiplos++;
                        }
                    }
                    System.out.println("Quantidade de multiplos de 3 entre 1 e 100: " + multiplos);
                break;

                default:
                    System.out.println("Opção Invalida, tente novamente.");
                break;
            }
        } while (op != 7);
        }
}

