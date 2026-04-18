package mundo;
import java.util.Scanner;
public class Maior3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: "); int n1 = sc.nextInt();
        System.out.print("N2: "); int n2 = sc.nextInt();
        System.out.print("N3: "); int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("O maior é: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O maior é: " + n2);
        } else {
            System.out.println("O maior é: " + n3);
        }
        sc.close();
    }
}
