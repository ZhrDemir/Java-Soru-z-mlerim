package week01_turnerySoruları;

import java.util.Scanner;

public class C_ternerySoru3 {
    public static void main(String[] args) {

        // soru3: Harf iste küçük girdiyse büyük yazdır yoksa girilen harfi yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char harf = scanner.next().toUpperCase().charAt(0);

        System.out.println((harf>='A' && harf<= 'Z' ) ?  harf : "yanlış girdiniz");

    }
}
