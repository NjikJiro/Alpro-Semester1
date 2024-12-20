import java.util.Scanner;

public class KlasifikasiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = input.nextInt();

        System.out.print("Masukkan persentase kehadiran: ");
        int kehadiran = input.nextInt();

        if (nilaiUjian >= 85 && kehadiran >= 90) {
            System.out.println("Lulus dengan baik");
        } else if (nilaiUjian >= 70 && nilaiUjian <= 85 && kehadiran >= 75) {
            System.out.println("Lulus");
        } else if (nilaiUjian >= 50 && nilaiUjian < 70 && kehadiran < 75) {
            System.out.println("Remedial karena kehadiran rendah");
        } else if (nilaiUjian < 50) {
            System.out.println("Tidak lulus karena nilai rendah");
        } else if (nilaiUjian > 70 && kehadiran < 75) {
            System.out.println("Tidak lulus karena absensi rendah");
        }

        input.close();
    }
}
