import java.util.ArrayList;
import java.util.Scanner;

public class arrayTransaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int HARGA_AYAM = 6000;

        // ArrayList untuk menyimpan transaksi
        ArrayList<Integer> transaksi = new ArrayList<>();
        
        // Variabel untuk menghitung total ayam terjual dan total pendapatan
        int totalAyamTerjual = 0;
        int totalPendapatan = 0;
        
        System.out.println("=== Rekap Penjualan TelU Fried Chicken ===");
        System.out.println("Masukkan jumlah ayam yang terjual pada setiap transaksi.");
        System.out.println("Ketik 0 untuk selesai.\n");

        // Input jumlah ayam yang terjual
        int jumlahAyam;
        int noTransaksi = 1;
        while (true) {
            System.out.print("Transaksi ke-" + noTransaksi + ": ");
            jumlahAyam = input.nextInt();

            if (jumlahAyam == 0) {
                break;
            }

            transaksi.add(jumlahAyam); // Menyimpan transaksi
            totalAyamTerjual += jumlahAyam; // Menambahkan ke total ayam terjual
            totalPendapatan += jumlahAyam * HARGA_AYAM; // Menghitung pendapatan
            noTransaksi++;
        }

        // Menampilkan rekapitulasi penjualan
        System.out.println("\n=== Rekapitulasi Penjualan ===");
        System.out.println("Detil Transaksi:");
        for (int i = 0; i < transaksi.size(); i++) {
            System.out.println("Transaksi ke-" + (i + 1) + ": " + transaksi.get(i) + " potong ayam");
        }
        System.out.println("Total Ayam Terjual: " + totalAyamTerjual + " potong ayam");
        System.out.println("Total Pendapatan: Rp. " + totalPendapatan);
    }
}
