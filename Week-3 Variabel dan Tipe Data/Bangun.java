import java.util.Scanner;

public class Bangun{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Program penghitung bangun datar");
		System.out.println("1. Persegi");
		System.out.println("2. Segitiga Sama Sisi");
		System.out.println("3. Lingkaran");
		System.out.println("Pilih menu di atas ini :");
		int pil = input.nextInt();

		if (pil == 1) {
			System.out.println("Penghitung Persegi");
			System.out.print("Masukkan panjang sisi(cm) :");
			double sisi = input.nextInt();
			double luas = sisi*sisi;
			double kel = sisi*4;
			System.out.println("Keliling : " + kel + "cm");
			System.out.println("Luas : " + luas + "cm^2");
		}
		else if (pil == 2) {
			System.out.println("Penghitung Segitiga Sama Sisi");
			System.out.print("Masukkan panjang sisi(cm) :");
			double sisi = input.nextInt();
			System.out.print("Masukkan panjang alas(cm) :");
			double alas = input.nextInt();
			System.out.print("Masukkan tinggi(cm) :");
			double tinggi = input.nextInt();
			double kel = sisi*3;
			double luas = alas*tinggi/2;
			System.out.println("Keliling : " + kel + "cm");
			System.out.println("Luas : " + luas + "cm^2");
		}
		else if  (pil == 3) {
			System.out.println("Penghitung Lingkaran");
			System.out.print("Masukkan panjang diameter(cm) :");
			double diameter = input.nextInt();
			double jari = diameter/2;
			double luas = jari*jari*22/7;
			double kel = diameter*22/7;
			System.out.println("Keliling : " + kel + "cm");
			System.out.println("Luas : " + luas + "cm^2");
		}
		else {
			System.out.println("ERROR");
		}

	}
}