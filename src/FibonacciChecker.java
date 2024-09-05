import java.util.Scanner;

public class FibonacciChecker {
    static boolean isFibonacci(int n) {
        int a = 0, b = 1;

        while (b < n) {
            int next = a + b;
            a = b;
            b = next;
        }

        return (b == n || a == n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        if (isFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
