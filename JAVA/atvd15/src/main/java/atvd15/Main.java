package atvd15;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        
        
        System.out.println("Soma: " + soma.calcular(1, 6));
        System.out.println("Subtracao: " + subtracao.calcular(2, 7));
        System.out.println("Divisao: " + divisao.calcular(10, 5));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(12, 9));
    }
}