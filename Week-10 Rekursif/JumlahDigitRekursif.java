public class JumlahDigitRekursif {
    public static int jumlahDigit(int n) {

        if (n < 10) {
            return n;
        }
        // System.out.println(jumlahDigit(n / 10));
        return (n % 10) + jumlahDigit(n / 10);
    }

    public static void main(String[] args) {
        int angka = 0;

        try {
            angka = Integer.parseInt(args[0]);
            int jumlah = jumlahDigit(angka);
            System.out.println("Total " + angka + " = " + jumlah);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
