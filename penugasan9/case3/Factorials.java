package case3;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String lanjutkan = "y";
        Scanner scan = new Scanner(System.in);

        while (lanjutkan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan bilangan bulat: ");
            int nilai = scan.nextInt();
            try {
                int hasilFaktorial = MathUtils.factorial(nilai);
                System.out.println("Faktorial(" + nilai + ") = " + hasilFaktorial);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Faktorial lainnya? (y/n) ");
            lanjutkan = scan.next();
        }
    }
}
