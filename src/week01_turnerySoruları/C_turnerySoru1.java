package week01_turnerySoruları;

import java.util.Scanner;

public class C_turnerySoru1 {
    public static void main(String[] args) {


        //soru1: sayı iste 5 ile böl,"sayı 5 in katı" yaz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println(sayi % 5 ==0 && sayi>=0 ? "sayı 5 e tam bölünüyor": "");
    }
}
