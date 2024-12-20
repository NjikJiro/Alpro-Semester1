import java.util.Scanner;

public class Tanggal{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);

		System.out.print("Tanggal : ");
		int tanggal = input.nextInt();
		System.out.print("Bulan : ");
		int bulan = input.nextInt();
		System.out.print("Tahun : ");
		int tahun = input.nextInt();

		int jumlahHari = 31;
		if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
			jumlahHari = 30;
		}
		else if (bulan == 2){
			if(tahun % 4 == 0){
				jumlahHari = 29;
			}
			else{
				jumlahHari = 28;
			}
		}
		tanggal += 2;
		if(tanggal > jumlahHari){
			tanggal -= jumlahHari;
			bulan++;
			if(bulan > 12){
				bulan = 1;
				tahun ++;
			}
		} 

		String namaBulan;

        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Bulan tidak valid";
        }

        System.out.print(tanggal + " " + namaBulan + " " + tahun);


	}
}