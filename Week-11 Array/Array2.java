import java.util.Scanner;

public class Array2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nilaiMingguan = new double[10];

        System.out.println("Masukkan 10 nilai mingguan (0-100) :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Minggu ke " + (i+1) + " :");
            nilaiMingguan[i] = input.nextDouble();
        }

        System.out.print("Masukkan nilai tugas besar (0-100) :");
        double nilaiTubes = input.nextDouble();

        double rata2Mingguan = 0;
        for (int i = 0; i < 10; i++) {
            rata2Mingguan += nilaiMingguan[i];
        }
        double totalMingguan = rata2Mingguan / 10;
        double totalNilai = totalMingguan * 0.8 + nilaiTubes * 0.2;

        System.out.print("Nilai Akhir : " + totalNilai);



    }
}