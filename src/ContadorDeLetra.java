import java.util.Scanner;

public class ContadorDeLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar a existência da letra 'a': ");
        String input = scanner.nextLine();

        long count = input.chars()
                .filter(c -> c == 'a' || c == 'A')
                .count();

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        scanner.close();
    }
}
