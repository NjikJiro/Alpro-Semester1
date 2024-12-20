import java.util.Scanner;

public class BilanganPrima{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan bilangann: ");
		int n = input.nextInt();

		// boolean PrimaGaTuh = n > 1;
		boolean PrimaGaTuh = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				PrimaGaTuh = false;
				break;
			}
		}
		if (PrimaGaTuh) {
			System.out.println(n + " Adalah Bilangan Prima");
		}else {
			System.out.println(n + " Bukan Bilangan Prima");
		}
	}
}