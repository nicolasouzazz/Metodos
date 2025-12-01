public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Não posso chamar o metodo diretamente, preciso criar um objeto, pois o metodo
         * main é estatico
         */

        System.out.println("=====================");
        System.out.println("Métodos");
        System.out.println("=====================");
        System.out.println("Calculadora com métodos com e sem retorno");
        System.out.println("=====================");
        Soma(5, 10);
        System.out.println("=====================");
        int resultado = subtracao(10, 5);
        System.out.println("A subtração de 10 - 5 é igual a: " + resultado);
        System.out.println("=====================");
        Multiplicacao(5, 10);
        System.out.println("=====================");
        double resultadoDivisao = Divisao(10, 5);
        System.out.println("A divisão de 10 / 5 é igual a: " + resultadoDivisao);
        System.out.println("=====================");
    }

    static void Soma(int a, int b) {
        int soma = a + b; // metodo sem retorno
        System.out.println("A soma de " + a + " + " + b + " é igual a: " + soma);
    }

    static int subtracao(int a, int b) {
        return a - b; // metodo com retorno
    }

    static void Multiplicacao(int a, int b) {
        int multiplicacao = a * b; // metodo sem retorno
        System.out.println("A multiplicação de " + a + " * " + b + " é igual a: " + multiplicacao);
    }

    static double Divisao(double a, double b) {
        return a / b; // metodo com retorno
    }
}
