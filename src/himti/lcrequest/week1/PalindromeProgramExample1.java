package himti.lcrequest.week1;

public class PalindromeProgramExample1 {
    public static void main(String args[]) {
        int reverse, temp;
        int sum = 0; // Variabel untuk mengecek angka
        int n = 454;    // Variabel untuk angka palindrome

        temp = n;
        while (n > 0) {
            reverse = n % 10;
            System.out.println(n + " % 10 = " + reverse);

            sum = (sum * 10) + reverse;
            System.out.println("(sum * 10) + " + reverse + " = " + sum);

            n = n / 10;
            System.out.println("n / 10 = " + n);

            System.out.println();
        }

        if (temp == sum)
            System.out.println(temp + " merupakan Angka Palindrome.");
        else
            System.out.println(temp + " bukan merupakan Angka Palindrome.");
    }
}
