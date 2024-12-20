import java.util.Scanner;

public class AngkaToBiner{

	public static String konversi(int n, String biner){
		
		if (n == 0){
			return biner;
		}
		int sisa = n % 2;
		biner = sisa + biner;
		n = n / 2;

		return konversi(n, biner);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan bilangan Bulat : ");
		int n = input.nextInt();

		String biner = "";

		String hasilbiner = konversi(n, biner);

		System.out.print("Biner : " + hasilbiner);
	}
}