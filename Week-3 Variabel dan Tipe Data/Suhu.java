import java.util.*;

public class Suhu{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Suhu C :");
		double suhu = input.nextDouble();

		double reamur = (4 / 5) * suhu;
		double fahrenheit = (9 / 5) * suhu + 32;
		double kelvin = suhu + 273;

		System.out.println("Suhu reamur : " + reamur); 
		System.out.println("Suhu fahrenheit : " + fahrenheit); 
		System.out.println("Suhu kelvin : " + kelvin); 
	}
}