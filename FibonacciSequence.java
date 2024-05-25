import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        
        int a = 0, b = 1, c;
        System.out.print(a + " " + b); // Print initial two numbers of the Fibonacci sequence
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            if (c > n) {
                break;
            }
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}
