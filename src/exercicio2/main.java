package exercicio2;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        int contador = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("A letra 'a' ocorre " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi digitada.");
        }

        scanner.close();
    }
}