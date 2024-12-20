import java.util.Scanner;

public class perhitunganZakat {
    public static double menghitungNisab(double hargaEmas) {
        return 85 * hargaEmas;
    }

    public static double menghitungZakat(double pendapatanBersih) {
        return pendapatanBersih * 0.025;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan penghasilan tahunan Anda: ");
        double penghasilan = scanner.nextDouble();

        System.out.print("Masukkan pengeluaran tahunan Anda: ");
        double pengeluaran = scanner.nextDouble();

        System.out.print("Masukkan harga emas per gram: ");
        double hargaEmas = scanner.nextDouble();

        double nisab = menghitungNisab(hargaEmas);
        double pendapatanBersih = penghasilan - pengeluaran;

        System.out.println("\n--- Rincian Zakat ---");
        System.out.printf("Jumlah Pendapatan: Rp%,.2f%n", penghasilan);
        System.out.printf("Status Nisab: %s%n",
                (pendapatanBersih >= nisab ? "Melebihi Nisab" : "Tidak Melebihi Nisab"));
        System.out.printf("Besaran Penghasilan Bersih: Rp%,.2f%n", pendapatanBersih);

        if (pendapatanBersih >= nisab) {
            double zakat = menghitungZakat(pendapatanBersih);
            System.out.printf("Total Zakat yang harus dibayarkan: Rp%,.2f%n", zakat);
        } else {
            System.out.println("Anda tidak wajib membayar zakat.");
        }
    }
}
