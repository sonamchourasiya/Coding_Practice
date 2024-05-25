import java.util.Scanner;

public class S_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting the number of elements in the array
        System.out.println("Enter the number of elements you want to store in the array:");
        int n = sc.nextInt();

        // Creating the array and taking user input
        int[] arr = new int[n];
        System.out.println("Enter the values one by one for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reversing the array using the swap method
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Printing the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



    


