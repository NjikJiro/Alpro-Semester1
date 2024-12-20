import java.util.Scanner;

public class BinerToAngka {

    public static int konversi(String biner, int indeks) {
        if (indeks == biner.length()) {
            return 0;
        }
        int digit = Character.getNumericValue(biner.charAt(indeks));
        int posisiPangkat = biner.length() - 1 - indeks;
        int nilaiSaatIni = digit * (int) Math.pow(2, posisiPangkat);
        return nilaiSaatIni + konversi(biner, indeks + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner: ");
        String biner = input.nextLine();
        int hasilDesimal = konversi(biner, 0);
        System.out.println("Desimal: " + hasilDesimal);
    }
}
