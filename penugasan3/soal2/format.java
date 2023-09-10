import java.util.Scanner;
//mengimpor Scanner dari java.until
public class format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarasi objek Scanner untuk baca inputan pengguna
        String[] inputStrings = new String[3]; //array buat nyimpen 3 string yang diinputkan
        int[] inputIntegers = new int[3]; //array buat nyimpen 3 bil bulat yang di input
        int inputCount = 0; //var buat ngitung berapa banyak input yang dimasukin

        while (inputCount < 3) { //loopnya bakal jalan kalo inputCount kurang dari 3
            String inputString = scanner.next(); //membaca string berikutnya yg diinputkan & menyimpannya dalam var inputString
            int inputInteger = scanner.nextInt(); //membaca bil bulat berikutnya yg diinputkan & menyimpannya dalam var inputInteger

            inputStrings[inputCount] = inputString; //menyimpan string yang baru dibaca pada indeks inputCount
            inputIntegers[inputCount] = inputInteger; //menyimpan bil bulat yang baru dibaca pada indeks inputCount

            inputCount++; //menambahkan nilai inputCount untuk menerima input selanjutnya

            if (inputCount == 3) { //jika sudah memasukan 3 input
                for (int i = 0; i < 3; i++) { //ngulangin 3 kali sesuai inputan
                    String formattedString = String.format("%-15s", inputStrings[i]);
                    //format string pada indeks i jadi 15 karakter pertama yg rata kiri
                
                    String formattedInteger = String.format("%03d", inputIntegers[i]);
                    //format bil bulat pada indeks i jadi 3 digit dengan leading zeros jika kurang dari 3 digit
                  
                    System.out.println(formattedString + formattedInteger);
                    //nampilkan output 

                //reset inputCount untuk menerima 3 input lagi
                inputCount = 0;
            }
                 scanner.close();
        }
   
    }
}
}

