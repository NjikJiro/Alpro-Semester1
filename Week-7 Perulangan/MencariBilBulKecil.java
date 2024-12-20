import java.util.Scanner;

public class BilanganKubikTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai batas (contoh: 12000): ");
        int batas = scanner.nextInt();
        int n = 1;
        
        // Menggunakan for loop
        for (n = 1; n * n * n <= batas; n++) {
            // Tidak ada yang perlu di proses
        }
        System.out.println("Nilai terkecil n dengan for loop: " + n);

        // Menggunakan while loop
        n = 1;
        while (n * n * n <= batas) {
            n++;
        }
        System.out.println("Nilai terkecil n dengan while loop: " + n);

        // Menggunakan do-while loop
        n = 1;
        do {
            n++;
        } while (n * n * n <= batas);
        System.out.println("Nilai terkecil n dengan do-while loop: " + n);
    }
}
