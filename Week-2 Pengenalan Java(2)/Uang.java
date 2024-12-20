package Pertemuan_1;

import java.util.Scanner;

public class Uang {
    public static void main(String[] args) {
        double SGD_RATE = 0.000094;
        double USD_RATE = 0.000066;
        double JPY_RATE = 0.0073;
        double EUR_RATE = 0.000056;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Rupiah: ");
        double rupiah = scanner.nextDouble();

        System.out.println("Konversi ke mata uang lain:");
        System.out.println("SGD: " + rupiah * SGD_RATE);
        System.out.println("USD: " + rupiah * USD_RATE);
        System.out.println("JPY: " + rupiah * JPY_RATE);
        System.out.println("EUR: " + rupiah * EUR_RATE);
    }
}
