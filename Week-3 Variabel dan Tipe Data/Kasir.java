import java.util.*;

public class Kasir{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan jumlah total belanja: ");
        int totalBelanja = input.nextInt();

        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int uangDibayarkan = input.nextInt();

        int kembalian = uangDibayarkan - totalBelanja;

        // if (kembalian == 0) {
        //     System.out.println("Uang yang dibayarkan tidak cukup.");
        //     return;
        // }

        System.out.println("Jumlah kembalian: " + kembalian);

        int lembar10000 = kembalian / 10000;
        kembalian %= 10000;

        int lembar5000 = kembalian / 5000;
        kembalian %= 5000;

        int lembar1000 = kembalian / 1000;
        kembalian %= 1000;

        int lembar500 = kembalian / 500;
        kembalian %= 500;

        int lembar100 = kembalian / 100;

        System.out.println("Jumlah lembar kembalian:");
        System.out.println("10000: " + lembar10000);
        System.out.println("5000: " + lembar5000);
        System.out.println("1000: " + lembar1000);
        System.out.println("500: " + lembar500);
        System.out.println("100: " + lembar100);
	}
}