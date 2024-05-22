public class SmallestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 3, 9, 1, 6, 7};

        // Find the smallest number in the array
        int smallest = findSmallestNumber(numbers);

        // Print the smallest number
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallestNumber(int[] array) {
        // Initialize the smallest number with the first element of the array
        int smallest = array[0];

        // Loop through the array to find the smallest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }
}
