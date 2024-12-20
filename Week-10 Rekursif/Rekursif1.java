import java.util.Scanner;

public class Rekursif1{

	public static int hitungN(int n){
		if (n == 0 || n == 1){
			return 1;
		}
		return n + hitungN(n-1);
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan bilangan N : ");
		int n = input.nextInt();

		int jumlah = hitungN(n);

		System.out.print("Output = " + jumlah);
	}
}