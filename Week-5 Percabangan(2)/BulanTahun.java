import java.util.Scanner;

public class BulanTahun{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Opsi : [1. Januari, 2. Februari, 3. Maret, 4. April, 5. Mei, 6. Juni, 7. Juli, 8. Agustus, 9. September, 10. Oktober, 11. November, 12. Desember]");
		
		System.out.print("Bulan Sekarang : ");
		int bulanSekarang = input.nextInt();

		if(bulanSekarang < 0 || bulanSekarang > 12){
			System.out.print("Bulan Tidak Valid");
			return;
		}

		System.out.print("Tahun Sekarang : ");
		int tahunSekarang = input.nextInt();
		System.out.print("Bulan Target : ");
		int nBulan = input.nextInt();

		int totalBulan = bulanSekarang + nBulan;
		int bulanLagi = totalBulan % 12;
		int tahunLagi = tahunSekarang + totalBulan/12;

		String bulanAkhir;

		switch (bulanLagi){
			case 1:
                bulanAkhir = "Januari";
                break;
            case 2:
                bulanAkhir = "Februari";
                break;
            case 3:
                bulanAkhir = "Maret";
                break;
            case 4:
                bulanAkhir = "April";
                break;
            case 5:
                bulanAkhir = "Mei";
                break;
            case 6:
                bulanAkhir = "Juni";
                break;
            case 7:
                bulanAkhir = "Juli";
                break;
            case 8:
                bulanAkhir = "Agustus";
                break;
            case 9:
                bulanAkhir = "September";
                break;
            case 10:
                bulanAkhir = "Oktober";
                break;
            case 11:
                bulanAkhir = "November";
                break;
            case 12:
                bulanAkhir = "Desember";
                break;
            default:
                bulanAkhir = "Bulan tidak valid";			
			}

System.out.println(nBulan + " bulan dari bulan " + bulanSekarang + " pada tahun " + tahunSekarang + " adalah bulan " + bulanAkhir + " pada tahun " + tahunLagi);

		}
}