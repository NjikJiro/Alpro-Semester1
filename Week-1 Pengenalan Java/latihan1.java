import java.util.Scanner;

public class latihan1 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan nama :");
		String nama = input.nextLine();

		System.out.print("Masukkan umur :");
		int umur = input.nextInt();

		System.out.println("==================================");
		System.out.println("Nama :" + nama);
		System.out.println("Umur :" + umur);
	}
}