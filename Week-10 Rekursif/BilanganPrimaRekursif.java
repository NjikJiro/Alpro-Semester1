public class BilanganPrimaRekursif {
    public static boolean cekPrima(int n, int pembagi) {
        if (pembagi == 1) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return cekPrima(n, pembagi - 1);
    }

    public static void main(String[] args) {
        int angka = 16; // Masukkan bilangan yang akan diperiksa
        boolean isPrima = cekPrima(angka, angka / 2);

        if (isPrima) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
}
