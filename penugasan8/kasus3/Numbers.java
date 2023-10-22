import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");
        int numIntegers = in.nextInt();

        Integer[] numbers = new Integer[numIntegers];
        System.out.print("Enter " + numIntegers + " integers: ");
        for (int i = 0; i < numIntegers; i++) {
            numbers[i] = in.nextInt();
        }

        Sorting.insertionSort(numbers);

        System.out.println("Sorted numbers (DESC):");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

