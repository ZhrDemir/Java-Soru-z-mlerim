package week03_MethhodSoruları;

import java.util.Scanner;

public class C_soru3_AsalMetod {
    public static void main(String[] args) {


        // Kullanıcıdan main metod içinde poz tamsayı alın.
        // asal s olup olmadığını inceleyip
        // sonuçları döndüren bir metod.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı giriniz");
        int sayi = scanner.nextInt();
        System.out.print(sayi + " sayısı asal sayı mı? " + asalSayiMi(sayi));


    }public static boolean asalSayiMi(int sayi){
        boolean flag = true;
        for (int i = 2 ; i < sayi; i++) {
            if (sayi%i == 0){
                flag = false;
                break;
            }
        }return flag;
    }
}
