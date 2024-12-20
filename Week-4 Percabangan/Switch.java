import java.util.*;

public class Switch{
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);

		int pilihan;
		System.out.println("====== MENU ======");
		System.out.println("1. Sistem Penilaian");
		System.out.println("0. Keluar");
		System.out.print("Pilih Opsi: ");

		pilihan = inputUser.nextInt();

		switch(pilihan){
		case 1:
			String nama, grade;
			int nilai;

			System.out.print("Masukkan nama: ");
			nama = inputUser.next();

			System.out.print("Masukkan nilai: ");
			nilai = inputUser.nextInt();

			if(nilai >= 90 && nilai <=100){
				grade = "A";
				System.out.print(grade);
			}else if(nilai >= 80 && nilai < 90){
				grade = "B";
				System.out.print(grade);
			}else if(nilai >= 70 && nilai < 80){
				grade = "C";
				System.out.print(grade);
			}else if(nilai >= 60 && nilai < 70){
				grade = "D";
				System.out.print(grade);
			}else{
				grade = "F";
				System.out.print("remidi "+grade);
			}
			break;
		case 0:
			System.out.print("Keluar dari Program");
			break;
		default: 
			System.out.print("Pilihan tidak tersedia");
			break;
		}


		// String nama, grade;
		// int nilai;

		// System.out.print("Masukkan nama: ");
		// nama = inputUser.next();

		// System.out.print("Masukkan nilai: ");
		// nilai = inputUser.nextInt();

		// if(nilai >= 90 && nilai <=100){
		// 	grade = "A";
		// 	System.out.print(grade);
		// }else if(nilai >= 80 && nilai < 90){
		// 	grade = "B";
		// 	System.out.print(grade);
		// }else if(nilai >= 70 && nilai < 80){
		// 	grade = "C";
		// 	System.out.print(grade);
		// }else if(nilai >= 60 && nilai < 70){
		// 	grade = "D";
		// 	System.out.print(grade);
		// }else{
		// 	grade = "F";
		// 	System.out.print("remidi "+grade);
		// }



	}
}