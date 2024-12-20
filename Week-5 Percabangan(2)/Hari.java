import java.util.Scanner;

public class Hari{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Opsi : [0. Minngu, 1. Senin, 2. Selasa, 3. Rabu, 4. Kamis, 5. Jumat, 6. Sabtu]");
		System.out.print("Hari ini adalah hari : ");
		int hariIni = input.nextInt();

		if (hariIni < 0 || hariIni > 7){
			System.out.print("Hari Tidak Valid");
			return;
		}

		int hariLusa = (hariIni + 2) % 7;

		String hari;
		if (hariLusa == 0){
			hari = "Minggu";
		}
		else if (hariLusa == 1){
			hari = "Senin";
		}
		else if (hariLusa == 2){
			hari = "Selasa";
		}
		else if (hariLusa == 3){
			hari = "Rabu";
		}
		else if (hariLusa == 4){
			hari = "Kamis";
		}
		else if (hariLusa == 5){
			hari = "Jumat";
		}
		else{
			hari = "Sabtu";
		}

		System.out.print("Hari lusa adalah : " + hari);
	}
}