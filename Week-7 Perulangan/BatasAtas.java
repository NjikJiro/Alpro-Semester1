import java.util.Scanner;

public class BatasAtas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai batas: ");
        int batas = scanner.nextInt();

        int sum = 0; 
        String output = ""; 

        for (int i = 2; i <= batas; i += 2) {
            sum += i;
            output += i;

            if (i + 2 <= batas) {
                output += " + ";
            }
        }

        System.out.println(output + " = " + sum);
    }
}
