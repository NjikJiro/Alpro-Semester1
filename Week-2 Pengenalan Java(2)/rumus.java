package Pertemuan_1;

import java.util.Scanner;

public class rumus {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Jaring - Jaring : ");
        double jariJari = scanner.nextDouble();

        double keliling = 2 * pi * jariJari;
        double luas = pi * jariJari * jariJari;

        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);

    }
}
