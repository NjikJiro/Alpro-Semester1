import java.util.Scanner;

public class TujuhDigit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan 7 digit angka : ");
		int angka = input.nextInt();

		if(angka > 0 && angka < 10000000){

			int juta = angka /1000000;
			angka = angka %1000000;

			int ratusRibu = angka /100000;
			angka = angka %100000;

			
			int puluhRibu = angka /10000;
			angka = angka %10000;

			
			int ribuan = angka /1000;
			angka = angka %1000;

			
			int ratusan = angka /100;
			angka = angka %100;

			
			int puluhan = angka /10;

			int satuan = angka %10;

			if(juta > 0){
			    System.out.println(juta + " Jutaan");
			}
			if(ratusRibu > 0){
			    System.out.println(ratusRibu + " Ratusan Ribu");
			}
			if(puluhRibu > 0){
			    System.out.println(puluhRibu + " Puluhan Ribu");
			}
			if(ribuan > 0){
			    System.out.println(ribuan + " Ribuan");
			}
			if(ratusan > 0){
			    System.out.println(ratusan + " Ratusan");
			}
			if(puluhan > 0){
			    System.out.println(puluhan + " Puluhan");
			}
			if(satuan > 0){
			    System.out.println(satuan + " Satuan");
			}

			}
		else{
			System.out.print("Angka harus diantara 1 sampai 7 digit");
		}
	}
}