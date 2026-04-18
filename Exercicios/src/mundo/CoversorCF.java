package mundo;
 import java.util.Scanner;
public class CoversorCF {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double c = sc.nextDouble();
        
        double f = (c * 9/5) + 32;
        System.out.println("Em Fahrenheit: " + f + "°F");
        sc.close();
    }
}
