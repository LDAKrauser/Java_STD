import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int s=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++) {
            s*=i;
        }
        System.out.println("factorial is: " + s);
    }
}   