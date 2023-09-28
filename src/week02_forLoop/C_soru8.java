package week02_forLoop;

import java.util.Scanner;

public class C_soru8 {
    public static void main(String[] args) {

        // poz sayı al
        // 1 den başlayarak tüm sayıları yazdır
        // 3 ile böl sa sayı yerine fizz
        // 5 ile böl sa yerine buzz
        // hem 3 hem 5 ile böl sa fizzBuzz yaz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tam sayı yazın:" );
        int sayi = scanner.nextInt();

        for ( int i = 1 ; i <= sayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(" fizzBuzz, ");
                } else if (i % 3 == 0 ){
            System.out.print(" fizz, ");
            } else if (i % 5 == 0) {
                System.out.print(" buzz ,");

            } else System.out.print(i + ",");

        }
    }
}
