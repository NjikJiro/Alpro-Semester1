import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 3 digit: ");
        int angka = input.nextInt();

        String[] satuan = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] belasan = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] puluhan = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String hasil = "";

        if (angka < 10) {
            hasil = satuan[angka];
        } else if (angka < 20) {
            hasil = belasan[angka - 10];
        } else if (angka < 100) {
            hasil = puluhan[angka / 10] + " " + satuan[angka % 10];
        } else if (angka < 1000) {
            int ratusan = angka / 100;
            int sisanya = angka % 100;

            hasil = satuan[ratusan] + " Hundred ";

            if (sisanya < 10) {
                hasil += satuan[sisanya];
            } else if (sisanya < 20) {
                hasil += belasan[sisanya - 10];
            } else {
                hasil += puluhan[sisanya / 10] + " " + satuan[sisanya % 10];
            }
        }

        System.out.println(hasil);
    }
}
