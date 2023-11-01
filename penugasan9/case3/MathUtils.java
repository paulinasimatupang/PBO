package case3;

public class MathUtils {
    // Mengembalikan nilai faktorial dari argumen yang diberikan
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif");
        } else if (n > 16) {
            throw new IllegalArgumentException("Faktorial hanya didefinisikan untuk argumen hingga 16");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
