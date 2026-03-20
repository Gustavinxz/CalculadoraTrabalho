import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int continuar;

        do {
            double n1, n2, resultado;
            int op;

            System.out.println("Escolha as opções da calculadora !!!");
            System.out.println("------------------------------------------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("------------------------------------------");

            System.out.print("Escolha a operação: ");
            op = sc.nextInt();

            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            n2 = sc.nextDouble();

            if (op == 1) {
                resultado = Operacoes.somar(n1, n2);
                System.out.println("Resultado: " + resultado);
            } else if (op == 2) {
                resultado = Operacoes.subtrair(n1, n2);
                System.out.println("Resultado: " + resultado);
            } else if (op == 3) {
                resultado = Operacoes.multiplicar(n1, n2);
                System.out.println("Resultado: " + resultado);
            } else if (op == 4) {
                if (n2 != 0) {
                    resultado = Operacoes.dividir(n1, n2);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não se pode dividir por zero !!!");
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja fazer outra operação? (1 - Sim / 2 - Não): ");
            continuar = sc.nextInt();

        } while (continuar == 1);

        sc.close();
        System.out.println("Programa encerrado.");
    }
}