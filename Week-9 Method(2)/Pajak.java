import java.util.Scanner;
import java.text.DecimalFormat;

public class Pajak{

	public static double jumlahPTKP(int status, int anak){

		double ptkp = 0;

		if (status == 1) {
			if (anak == 0) {
				ptkp = 54000000;
			} else if (anak == 1){
				ptkp = 58500000;
			} else if (anak == 2){
				ptkp = 63000000;
			} else if (anak == 3){
				ptkp = 67500000;
			}
		}
		else if (status == 2) {
			if (anak == 0) {
				ptkp = 58500000;
			} else if (anak == 1){
				ptkp = 63000000;
			} else if (anak == 2){
				ptkp = 67500000;
			} else if (anak == 3){
				ptkp = 72000000;
			}
		}
		return ptkp;
	}

	public static double jumlahPKP(double penghasilan ,double ptkp){
		return penghasilan - ptkp;
	}

	public static double[] hitungPajak(double pkp){

		double pajakLapisan1 = 0;
	    double pajakLapisan2 = 0;
	    double pajakLapisan3 = 0;
	    double pajakLapisan4 = 0;

		double pajak = 0;

		//lapisan ke-1
		if (pkp > 60000000) {
			pajakLapisan1 = 60000000 * 0.05;
			pkp -= 60000000;
		} else{
			pajakLapisan1 = pkp * 0.05;
            pkp = 0;
		}

		//lapisan kedua-2
		if (pkp > 250000000) {
			pajakLapisan2 = (250000000 - 60000000) * 0.15;
			pkp -= (250000000 - 60000000);
		} else{
			pajakLapisan2 = pkp * 0.15;
            pkp = 0;
		}

		//lapisan ke-3
		if (pkp > 500000000) {
			pajakLapisan3 = (500000000 - 250000000) * 0.25;
			pkp -= (500000000 - 250000000);
		} else{
			pajakLapisan3 = pkp * 0.25;
            pkp = 0;
		}

		//lapisan ke-4
		pajakLapisan4 = pkp * 0.35;
        
        return new double[]{pajakLapisan1, pajakLapisan2, pajakLapisan3, pajakLapisan4};

	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###");

		System.out.println("\n===== Program Penghitung Pajak =====");

		System.out.print("\nMasukkan Penghasilan Tahunan : ");
		double penghasilan = input.nextDouble();

		System.out.println("\nStatus Pernikahan");
		System.out.println("1. Belum Menikah");
		System.out.println("2. Menikah");
		System.out.print("Masukkan Status Pernikahan : ");
		int statusPernikahan = input.nextInt();

		System.out.print("\nMasukkan Jumlah Anak : ");
		int jumlahAnak = input.nextInt();

		double ptkp = jumlahPTKP(statusPernikahan, jumlahAnak);
		double pkp = jumlahPKP(penghasilan, ptkp);
		double[] lapisanPajak = hitungPajak(pkp);

		System.out.println("\n================================");
		System.out.println("\nPTKP (Penghasilan Tidak Kena Pajak) : Rp." + formatter.format(ptkp));

		if (pkp <= ptkp) {
			System.out.println("\nKarena PKP anda lebih kecil dari PTKP, Anda tidak wajib membayar pajak");
			System.out.println("\n================================");
		} else {
			System.out.println("\nPKP (Penghasilan Kena Pajak) : Rp." + formatter.format(pkp));
			System.out.println(" ");

			if (lapisanPajak[0] > 0) {
			    System.out.println("Pajak Lapisan 1 (5%): Rp." + formatter.format(lapisanPajak[0]));
			}
			if (lapisanPajak[1] > 0) {
			    System.out.println("Pajak Lapisan 2 (15%): Rp." + formatter.format(lapisanPajak[1]));
			}
			if (lapisanPajak[2] > 0) {
			    System.out.println("Pajak Lapisan 3 (25%): Rp." + formatter.format(lapisanPajak[2]));
			}
			if (lapisanPajak[3] > 0) {
			    System.out.println("Pajak Lapisan 4 (30%): Rp." + formatter.format(lapisanPajak[3]));
			}

			double totalPajak = lapisanPajak[0] + lapisanPajak[1] + lapisanPajak[2] + lapisanPajak[3];
			System.out.println("\nTotal pajak yang harus dibayar : Rp." + formatter.format(totalPajak));
			System.out.println("\n================================");
		}
	}
}