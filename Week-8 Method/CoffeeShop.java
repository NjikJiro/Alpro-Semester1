import java.util.Scanner;

public class CoffeeShop {
    static Scanner input = new Scanner(System.in);

    // Daftar makanan, minuman, dan harga
    static String[] makanan = {"Nasi Goreng", "Mie Goreng", "Ayam Geprek", "Salad"};
    static int[] hargaMakanan = {20000, 18000, 25000, 15000};

    static String[] minuman = {"Kopi", "Teh", "Jus", "Air Mineral"};
    static int[] hargaMinuman = {10000, 8000, 12000, 5000};

    public static int[] pilihItem(String jenis, String[] item, int[] harga) {
        System.out.println("\nPilih " + jenis + ":");
        for (int i = 0; i < item.length; i++) {
            System.out.println((i + 1) + ". " + item[i] + " - Rp " + harga[i]);
        }

        System.out.print("Masukkan nomor pilihan " + jenis + ": ");
        int pilihan = input.nextInt();
        
        // Validasi input
        if (pilihan < 1 || pilihan > item.length) {
            System.out.println("Pilihan tidak valid. Silakan ulangi.");
            return pilihItem(jenis, item, harga);
        }

        System.out.print("Masukkan jumlah " + jenis + " yang dibeli: ");
        int jumlah = input.nextInt();

        int totalHarga = harga[pilihan - 1] * jumlah;
        return new int[]{pilihan, totalHarga, jumlah};
    }

    public static int prosesPembayaran(int totalHarga) {
        int pembayaran;
        do {
            System.out.print("Masukkan uang pembayaran: Rp ");
            pembayaran = input.nextInt();

            if (pembayaran < totalHarga) {
                System.out.println("Uang tidak cukup, silakan coba lagi.");
            }
        } while (pembayaran < totalHarga);
        return pembayaran;
    }

    public static void cetakSlip(String[] makanan, int[] hargaMakanan, int[] makananDipilih,
                                 String[] minuman, int[] hargaMinuman, int[] minumanDipilih,
                                 int totalHarga, int pembayaran) {
        System.out.println("\n---------- Slip Transaksi ----------");
        System.out.println("Makanan : " + makanan[makananDipilih[0] - 1] + " x " + makananDipilih[2] + " = Rp " + makananDipilih[1]);
        System.out.println("Minuman : " + minuman[minumanDipilih[0] - 1] + " x " + minumanDipilih[2] + " = Rp " + minumanDipilih[1]);
        System.out.println("Total : Rp " + totalHarga);
        System.out.println("Pembayaran : Rp " + pembayaran);
        System.out.println("Kembalian : Rp " + (pembayaran - totalHarga));
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di Jigor Coffee");

        int[] makananDipilih = pilihItem("makanan", makanan, hargaMakanan);
        int[] minumanDipilih = pilihItem("minuman", minuman, hargaMinuman);

        int totalHarga = makananDipilih[1] + minumanDipilih[1];
        System.out.println("");
        System.out.println("Total harga: Rp " + totalHarga);

        int pembayaran = prosesPembayaran(totalHarga);
        cetakSlip(makanan, hargaMakanan, makananDipilih, minuman, hargaMinuman, minumanDipilih, totalHarga, pembayaran);
    }
}
