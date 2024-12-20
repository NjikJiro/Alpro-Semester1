import java.util.Scanner;

public class LuasKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Pilihan");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Balok");

        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        double keliling, luas;

        switch (pilihan) {
            case 1:
                System.out.print("Input panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Input lebar: ");
                double lebar = input.nextDouble();

                keliling = 2 * (panjang + lebar);
                luas = panjang * lebar;

                System.out.println("Keliling: " + keliling);
                System.out.println("Luas: " + luas);
                break;

            case 2:
                System.out.print("Input jari-jari: ");
                double jari = input.nextDouble();

                keliling = 2 * 3.14 * jari;
                luas = 3.14 * jari * jari;

                System.out.println("Keliling: " + keliling);
                System.out.println("Luas: " + luas);
                break;

            case 3:
                System.out.print("Input panjang: ");
                double panjangBalok = input.nextDouble();
                System.out.print("Input lebar: ");
                double lebarBalok = input.nextDouble();
                System.out.print("Input tinggi: ");
                double tinggi = input.nextDouble();

                double luasPermukaan = 2 * ((panjangBalok * lebarBalok) + (panjangBalok * tinggi) + (lebarBalok * tinggi));
                double volume = panjangBalok * lebarBalok * tinggi;

                System.out.println("Luas Permukaan: " + luasPermukaan);
                System.out.println("Volume: " + volume);
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}
