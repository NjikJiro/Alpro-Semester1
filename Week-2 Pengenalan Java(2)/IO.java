import java.util.Scanner;

public class IO {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan value variabel A : ");
		int variabelA = input.nextInt();

		System.out.print("Masukkan value variabel B : ");
		int variabelB = input.nextInt();

		System.out.println("==================================");
		System.out.println("Tampilkan Data Awal");
		System.out.println("Nilai A adalah :" + variabelA);
		System.out.println("Nilai B adalah :" + variabelB);

// Tukar value variabel
		int temp = variabelA;
		variabelA = variabelB;
		variabelB = temp;

		System.out.println("==================================");
		System.out.println("Tampilkan Data Yang Sudah Diubah");
		System.out.println("Nilai A adalah :" + variabelA);
		System.out.println("Nilai B adalah :" + variabelB);


	}
}



