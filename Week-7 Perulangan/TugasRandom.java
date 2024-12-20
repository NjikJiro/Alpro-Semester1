import java.util.Random;
import java.util.Scanner;

public class TugasRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        int nilai = gen.nextInt(100);

        System.out.println("Program tebak-tebakan :)");
        int tebakan = 0;
        int jumlahTebakkan = 0;

        while (tebakan != nilai) {
            System.out.print("Tebak angka antara 1 - 100: ");
            tebakan = input.nextInt();
            jumlahTebakkan++;

            if (tebakan > 100 || tebakan < 1) {
                System.out.println("Tebakan di luar rentang");
            } else if (tebakan > nilai) {
                System.out.println("Tebakan anda lebih besar");
            } else if (tebakan < nilai) {
                System.out.println("Tebakan anda lebih kecil");
            } else {
                System.out.println("Tebakan anda benar! Angka yang benar adalah " + nilai);
                System.out.println("Jumlah tebakkan anda " + jumlahTebakkan);
            }
        }
    }
}
