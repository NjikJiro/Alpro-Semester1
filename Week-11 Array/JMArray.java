
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###");

        int hargaAyam = 10000;
        int hargaBebek = 12000;
        int hargaMinum = 6000;

        ArrayList<Integer> transaksiAyam = new ArrayList<>();
        ArrayList<Integer> transaksiBebek = new ArrayList<>();
        ArrayList<Integer> transaksiMinum = new ArrayList<>();

        int totalAyamTerjual = 0;
        int totalBebekTerjual = 0;
        int totalMinumTerjual = 0;
        int totalPendapatan = 0;

        System.out.println("=== Rekap Penjualan TelU Fried Chicken ===");
        System.out.println("Masukkan jumlah produk yang terjual di setiap transaksi.");
        System.out.println("Ketik 0 untuk selesai.");

        int minggu = 1;
        while (true) {
            System.out.println("\nMinggu ke-" + minggu + " :");

            System.out.print("Jumlah ayam terjual :");
            int jumlahAyam = input.nextInt();
            System.out.print("Jumlah bebek terjual :");
            int jumlahBebek = input.nextInt();
            System.out.print("Jumlah minum terjual :");
            int jumlahMinum = input.nextInt();

            if (jumlahAyam == 0 && jumlahBebek == 0 && jumlahMinum == 0) {
                break;
            }

            transaksiAyam.add(jumlahAyam);
            transaksiBebek.add(jumlahBebek);
            transaksiMinum.add(jumlahMinum);

            totalPendapatan += (jumlahAyam * hargaAyam) + (jumlahBebek * hargaBebek) + (jumlahMinum * hargaMinum);
            minggu++;

        }

        for (int i = 0; i < transaksiAyam.size(); i++) {
            totalAyamTerjual += transaksiAyam.get(i);
            totalBebekTerjual += transaksiBebek.get(i);
            totalMinumTerjual += transaksiMinum.get(i);
        }

        System.out.println("-------------------------------");
        System.out.println("============================== Rekap Penjualan ==============================");
        for (int i = 0; i < transaksiAyam.size(); i++) {
            System.out.printf(
                    "Transaksi ke-%-3d | Ayam Goreng: %-3d | Bebek Goreng: %-3d | Air Mata Buaya: %-3d%n",
                    (i + 1),
                    transaksiAyam.get(i),
                    transaksiBebek.get(i),
                    transaksiMinum.get(i)
            );
        }

        System.out.println("-----------------------------------------------------------------------------");

        System.out.printf(
                "Total            | Ayam Goreng: %-3d | Bebek Goreng: %-3d | Air Mata Buaya: %-3d%n",
                totalAyamTerjual,
                totalBebekTerjual,
                totalMinumTerjual
        );
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nTotal Pendapatan:   Rp. " + formatter.format(totalPendapatan));
    }
}
