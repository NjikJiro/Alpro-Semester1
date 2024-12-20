import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan : ");
        int batas = input.nextInt();

        boolean isPrime1 = true;

        //perulangan pertama untuk menentukan apakah batas merupakan bilangan prima
 		for(int i = 2; i < batas; i++){
 			if ( batas % i == 0){
 				isPrime1 = false;
 				break;
 			}

 		}
 		if (isPrime1) {
 			System.out.print(batas + " Adalah bilangan prima dan ");
 		}
 		else {
 			System.out.print(batas + " Bukan bilangan prima dan ");
 		}

        System.out.println("bilangan prima dari 2 sampai " + batas + " adalah:");

        //perulangan kedua untuk mencari bilangan prima yang berada diantara 2 - batas
        for (int num = 2; num <= batas; num++) {
            boolean isPrime2 = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime2 = false;
                    break;
                }
            }

            if (isPrime2) {
                System.out.print(num + " ");
            }
        }
    }
}
