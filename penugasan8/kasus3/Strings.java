import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int numStrings = in.nextInt();
        in.nextLine(); // Konsumsi karakter newline

        String[] strings = new String[numStrings];
        System.out.print("Enter " + numStrings + " strings: ");
        for (int i = 0; i < numStrings; i++) {
            strings[i] = in.nextLine();
        }

        Sorting.insertionSort(strings);

        System.out.println("Sorted strings (DESC):");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}