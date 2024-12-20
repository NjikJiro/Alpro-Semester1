import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penghasilan (dalam juta): ");
        double penghasilan = input.nextDouble();

        double pajak = 0;

        if (penghasilan <= 50) {
            pajak = penghasilan * 0.05;
        } else if (penghasilan <= 100) {
            pajak = (50 * 0.05) + ((penghasilan - 50) * 0.10);
        } else if (penghasilan <= 200) {
            pajak = (50 * 0.05) + (50 * 0.10) + ((penghasilan - 100) * 0.15);
        } else {
            pajak = (50 * 0.05) + (50 * 0.10) + (100 * 0.15) + ((penghasilan - 200) * 0.20);
        }

        System.out.printf("Total pajak yang harus dibayar: " + pajak);
    }
}
