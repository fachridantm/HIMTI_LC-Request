package himti.lcrequest.week1;

import java.util.Scanner;

public class SumOfFirstAndLastDigitProgram {

    public static void main(String[] args) {

        // Deklarasi Variabel
        int lastDigit, firstDigit, totalDigits = 0, divisor;
        int sum = 0;
        int number, temp;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        number = in.nextInt();

        // Menghitung banyaknya digit yang diinput
        temp = number;
        while (number != 0) {
            totalDigits++;
            number = number / 10;
        }

        // Menentukan nilai pembagi
        divisor = (int) Math.pow(10, totalDigits - 1);

        // Menentukan nilai digit awal dan akhir
        lastDigit = temp % 10;
        firstDigit = temp / divisor;

        // Menjumlahkan nilai digit awal dan akhir
        sum = firstDigit + lastDigit;

        System.out.println("Penjumlahan dari nilai digit awal dan akhir dari " + temp + " adalah " + sum);
    }
}
