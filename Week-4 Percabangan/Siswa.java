import java.util.*;

public class Siswa{
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);

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



	}
}