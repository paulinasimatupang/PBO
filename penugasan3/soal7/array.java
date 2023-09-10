public class array {
    public static void main(String[] args) {
        //array satu dimensi
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        //array dua dimensi, setiap arraynya berisi array 1 dimensi yang dideklarasikan sebelumnya
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        //array tiga dimensi, berisi 3 array 2 dimensi yang dideklararasikan sebelumnya
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        // Cetak array dalam format yang diinginkan
        for (int[][] twoDArray : threeDimensionalArray) { //untuk mengakses setiap array 2 dimensi dalam array 3 dimensi
            System.out.print("{{");
            for (int[] row : twoDArray) { //mengakses setiap baris array 1 dimensi dalam array 2 dimensi
                for (int i = 0; i < row.length; i++) { 
                    System.out.print(row[i]); //mencetak elemen dalam baris, pisah pake spasi
                    if (i < row.length - 1) { //setiap output yang dikeluarkan, akan dicek spasinya diantara elemen
                        System.out.print(" ");
                    }
                }
                if (row != twoDArray[twoDArray.length - 1]) { 
                    //untuk memastikan baris tidak dilanjutkan setelah baris terakhir dlm array 2 dimensi
                    System.out.print(" ");
                }
            }
            System.out.println("}}");
        }
    }
}
