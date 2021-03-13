package himti.lcrequest.week1;

import java.util.Scanner;

public class PalindromeProgramExample2 {
    public static void main(String args[]) {
        int length;
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan angka yang ingin dicek : ");
        original = in.nextLine();
        length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            System.out.println(i + " = reverse + " + original.charAt(i) + " = " + reverse);
        }
        System.out.println();

        if (original.equals(reverse))
            System.out.println(original + " merupakan Angka Palindrome.");
        else
            System.out.println(original + " bukan merupakan Angka Palindrome.");
    }
}
