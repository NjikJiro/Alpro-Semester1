import java.util.Scanner;

public class Tahun{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Penghitung Hari : ");
		int awal = input.nextInt();

		System.out.println("----------------");

		int tahun = awal / 365;
		awal %= 365;
		int bulan = awal / 30;
		awal %= 30;
		int minggu = awal / 7;
		awal %= 7;
		int hari = awal;

		if(tahun > 0){
			System.out.println(tahun + " tahun");
		}
		if(bulan > 0){
			System.out.println(bulan + " bulan");
		}
		if(minggu > 0){
			System.out.println(minggu + " minggu");
		}
		if(hari > 0){
			System.out.println(hari + " hari");
		}
	}
}