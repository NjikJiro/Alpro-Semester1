import java.util.Scanner;

public class SelisihWaktu{
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);

		System.out.println("Inputkan waktu pertama : ");
		System.out.print("Jam pertama : ");
		int jam1 = input.nextInt();
		System.out.print("Menit pertama : ");
		int menit1 = input.nextInt();
		System.out.print("Detik pertama : ");
		int detik1 = input.nextInt();

		System.out.println("Inputkan waktu kedua : ");
		System.out.print("Jam kedua : ");
		int jam2 = input.nextInt();
		System.out.print("Menit kedua : ");
		int menit2 = input.nextInt();
		System.out.print("Detik kedua : ");
		int detik2 = input.nextInt();

		int waktu1 = (jam1*3600) + (menit1*60) +detik1;
		int waktu2 = (jam2*3600) + (menit2*60) +detik2;

		int temp;
		if(waktu1 > waktu2){
			temp = waktu1;
			waktu1 = waktu2;
			waktu2 = temp;
		}

		int selisih = waktu2 - waktu1;

		int jam = selisih / 3600;
		int menit = (selisih%3600) / 60;
		int detik = (selisih%3600) % 60;

		System.out.println("Waktu pertama " + jam1 + ":" + menit1 + ":" + detik1);
		System.out.println("Waktu kedua " + jam2 + ":" + menit2 + ":" + detik2);
		System.out.println("Selisih " + jam + ":" + menit + ":" + detik);
	}
}