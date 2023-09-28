package week01_turnerySoruları;

import java.util.Scanner;

public class C_ternerySoru5 {
    public static void main(String[] args) {
        // soru 5: iki sayı al büyük olmayan yaz
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayı girin");
       double sayi1 = scanner.nextDouble();
       double sayi2 = scanner.nextDouble();
        System.out.println("büyük olmayan sayı :");
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1 );

    }
}
