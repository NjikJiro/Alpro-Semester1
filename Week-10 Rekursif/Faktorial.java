import java.util.Scanner;

public class Faktorial {
    // Menggunakan Perulangan
    // public static void main(String[] args) {
    //     int angka = 5; // Menghitung 5!
    //     int hasil = 1;

    //     // Menghitung faktorial menggunakan perulangan
    //     for (int i = angka; i >= 1; i--) {
    //         System.out.println("ini i: "+i);
    //         hasil *= i;
    //     }

    //     System.out.println(angka + "! = " + hasil);
    // }

    // Menggunakan Rekursif
    public static int hitungFaktorial(int n) {
        System.out.println("n = "+n);
        if (n == 0 || n == 1) {
            return 1;
        }
        // System.out.println("coba"+n * hitungFaktorial(n - 1));
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int angka = input.nextInt(); // Menghitung 5!
        int hasil = hitungFaktorial(angka);

        System.out.println(angka + "! = " + hasil);
    }
}
