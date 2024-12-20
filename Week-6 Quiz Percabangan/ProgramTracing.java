public class ProgramTracing {
    public static void main(String[] args) {
        
        int a = 8;
        int b = 3;
        int c = 7;

        if (a > b) {
            if (c < b) {
                System.out.println("1. c lebih kecil dari b");
            } else if (c == b) {
                System.out.println("2. c sama dengan b");
            } else {
                System.out.println("3. c lebih besar dari b");
            }
        } else {
            System.out.println("4. a lebih kecil dari b");
        }

        switch (a) {
            case 5:
                System.out.println("5. a adalah 5");
                break;
            case 8:
                System.out.println("6. a adalah 8");
                break;
            default:
                System.out.println("7. Nilai a tidak diketahui");
        }

        if ((b + c) > a) {
            System.out.println("8. Jumlah b & c lebih besar dari a");
        } else {
            System.out.println("9. Jumlah b & c lebih kecil atau sama dengan a");
        }
    }
}
