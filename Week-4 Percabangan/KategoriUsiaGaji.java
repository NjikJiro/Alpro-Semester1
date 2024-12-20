import java.util.Scanner;

public class KategoriUsiaGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan gaji tahunan (juta): ");
        int gaji = input.nextInt();

        if (usia < 18) {
            System.out.println("Masih sekolah");
        } else if (usia >= 18 && usia <= 25) {
            if (gaji >= 50) {
                System.out.println("Muda sukses");
            } else {
                System.out.println("Masih belajar hidup");
            }
        } else if (usia >= 26 && usia <= 40) {
            if (gaji >= 100) {
                System.out.println("Pekerja mapan");
            } else {
                System.out.println("Perlu perbaikan karier");
            }
        } else if (usia > 40) {
            if (gaji >= 150) {
                System.out.println("Profesional berpengalaman");
            } else {
                System.out.println("Perlu evaluasi finansial");
            }
        }

        input.close();
    }
}
