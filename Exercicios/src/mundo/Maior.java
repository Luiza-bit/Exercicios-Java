package mundo;
import java.util.Scanner;
public class Maior {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Número 2: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close();
    }

}
