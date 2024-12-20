import java.util.Scanner;

public class TugasAkhir {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan bilangan pertama :");
		double a = input.nextDouble();

		System.out.print("Masukkan bilangan kedua :");
		double b = input.nextDouble();

		double tambah = a + b;
		double kurang = a - b;
		double kali = a * b;
		double bagi = a/b;
		double modulus = a%b;
		System.out.println("==================================");
		System.out.println(a + " + " + b + " = " + tambah);
		System.out.println(a + " - " + b + " = " + kurang);
		System.out.println(a + " x " + b + " = " + kali);
		System.out.println(a + " / " + b + " = " + bagi);
		System.out.println(a + " % " + b + " = " + modulus);
	}

}