package week01_SorularIfElse;

import java.util.Scanner;

public class C_ifElseStaSoru5 {
    public static void main(String[] args) {

        // soru5: harf iste küçük harf ise büyük harf olarak yazdırın, yoksa girilen harfi yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen harf isteyin :");

        char harf = scanner.next().charAt(0);

        if (harf>= 'a' && harf<='z') {
            System.out.println(Character.toUpperCase(harf));

        }
        else {
            System.out.println(harf);}
    }
}
