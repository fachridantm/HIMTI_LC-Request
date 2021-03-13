package himti.lcrequest.week1;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {

        // Deklarasi Variabel
        int reverse, temp;
        int sum = 0;
        int n;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        n = in.nextInt();

        temp = n;
        while (n > 0) {
            reverse = n % 10;
            System.out.println("n % 10 = " + reverse);

            sum = (sum * 10) + reverse;
            System.out.println("(sum * 10) + " + reverse + " = " + sum);

            n = n / 10;
            System.out.println("n / 10 = " + n);

            System.out.println();
        }


        if (temp == sum) {
            System.out.println(temp + " merupakan bilangan Palindrome");
        } else {
            System.out.println(temp + " bukan merupakan bilangan Palindrome");
        }
    }
}
