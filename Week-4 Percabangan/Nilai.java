import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sistem Penilaian berdasarkan poin");
        System.out.print("Masukkan nama siswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nilai siswa : ");
        int nilai = input.nextInt();
        int nilai2 = nilai/10;
        String poin="";

        switch (nilai2){
        case 9 :
        	poin = "A";
        break;
        case 8 :
        	poin = "B";
        break;
        case 7 :
        	poin = "C";
        break;
        case 6 :
        	poin = "D";
        break;
        case 5 :
        	poin = "E";
        break;
        case 4 :
        	poin = "F";
        break;

    default:
    	System.out.println("Tora dongo");
    	break;
        }

        System.out.println(nama + " mendapatkan nilai " + poin);
    }
}
