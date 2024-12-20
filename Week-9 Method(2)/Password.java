import java.util.Scanner;

public class Password {
    public static boolean hurufVokal(char c) {
        return "AIUEOaiueo".indexOf(c) != -1;
    }

    public static boolean hurufKonsonan(char c) {
        return Character.isLetter(c) && !hurufVokal(c);
    }

    public static boolean digitAngka(char c) {
        return Character.isDigit(c);
    }

    public static boolean karakterSpesial(char c) {
        return !Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah Password: ");
        String password = scanner.nextLine(); 
        int jumlahHurufVokal = 0, jumlahHurufKonsonan = 0, jumlahAngka = 0, jumlahKarakterSpesial = 0;

        for (char c : password.toCharArray()) { 
            if (hurufVokal(c)) {
                jumlahHurufVokal++;
            } else if (hurufKonsonan(c)) {
                jumlahHurufKonsonan++;
            } else if (digitAngka(c)) {
                jumlahAngka++;
            } else if (karakterSpesial(c)) {
                jumlahKarakterSpesial++;
            }
        }

        System.out.println("Vokal: " + jumlahHurufVokal);
        System.out.println("Konsonan: " + jumlahHurufKonsonan);
        System.out.println("Angka: " + jumlahAngka);
        System.out.println("Karakter Spesial: " + jumlahKarakterSpesial);

        
    }
}