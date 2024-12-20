import java.util.Scanner;

public class Array1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        System.out.println("Masukkan 10 angka untuk array pertama :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke " + (i+1) + " :");
            array1[i] = input.nextInt();
        }
        
        System.out.println("Masukkan 10 angka untuk array kedua :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke " + (i+1) + " :");
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("\nHasil :");
        System.out.print("Array ke-1 : ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
            System.out.println(" ");
        
        System.out.print("Array ke-2 : ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
            System.out.println(" ");
        
        System.out.print("Array ke-3 : ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}