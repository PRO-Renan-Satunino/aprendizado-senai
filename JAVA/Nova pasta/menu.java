import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int op;
            
            do {
                System.out.println("Escolha uma opcao:");
                System.out.println("1-Caixa de Papelao");
                System.out.println("2-Sacola Plastica");
                System.out.println("3-Embalagens de vidro");
                op = scanner.nextInt();
                
                switch (op) {
                    case 1:
                        System.out.println("Ideal para transporte e armazenamento");
                        break;
                    case 2:
                        System.out.println("Leve e pratica, mas pouco sustentavel");
                        break;
                    case 3:
                        System.out.println("Resistente e reutilizavel");
                        break;
                    default: 
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (op != 3);

            scanner.close();
        }
}
