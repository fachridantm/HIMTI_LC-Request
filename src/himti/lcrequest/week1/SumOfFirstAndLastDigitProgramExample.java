package himti.lcrequest.week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfFirstAndLastDigitProgramExample {

    // Method untuk menghitung banyaknya digit dari angka yg diinput
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method untuk menjumlahkan digit pertama dan digit terakhir
    private static int FirstLastDigitSum(int number) {

        // Deklarasi Variabel
        int lastDigit, firstDigit, totalDigits, divisor;
        int sum = 0;

        // Memanggil method untuk menentukan banyaknya digit dari angka yg diinput
        totalDigits = findDigits(number);

        // Menenetukan nilai pembagi
        divisor = (int) Math.pow(10, totalDigits - 1);

        // Menentukan digit pertama dan terakhir
        firstDigit = number / divisor;
        lastDigit = number % 10;

        // Menjumlahlam nilai digit awal dan akhir
        sum = firstDigit + lastDigit;

        return sum;
    }

    public static void main(String[] args) {
        // Deklarasi Variabel dan Object untuk Scanner
        int number, sum;
        Scanner in = new Scanner(System.in);

        try {

            // Membaca input user
            System.out.print("Masukan angka : ");
            number = in.nextInt();

            // Memanggil method untuk menjumlahkan digit pertama dan terakhir
            sum = FirstLastDigitSum(number);

            // Hasil Output
            System.out.println("Jumlah dari digit awal dan akhir dari angka " + number + " = " + sum);

        } catch (InputMismatchException e) {
            // Int = 32 bit (10 Digit), Long = 64 bit (19 Digit)
            System.err.println(e);
            System.err.println("Angka yang Anda masukan tidak sesuai dengan tipe data yang Anda masukan!");
        }
    }
}
