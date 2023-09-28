package week02_forLoop;

import java.util.Scanner;

public class C_soru4 {
    public static void main(String[] args) {

        // soru4 : kullanıcıdan bas ve bitiş değeri olarak poz sayılar al
        //  sınırlar dahil aralarındaki tüm sayılar toplansın
        //  bitiş değeri bas değerinden küçükse
        //  de prog çalışsın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç için pozitif bir değer girin :");
        int bas = scanner.nextInt();

        System.out.println("Lütfen bitiş için pozitif bi değer girin");
        int bitis = scanner.nextInt();

        int toplam = 0;
        if (bas<bitis){
        for ( int i = bas ; i <= bitis ; i++  ){
            toplam += i;
        }
            System.out.println("Tüm sayıların Toplamı= " + toplam);
        } else {
            for ( int i1 = bas ; i1 >= bitis ; i1--){
                toplam += i1;
            }
        System.out.println("Tüm sayıların Toplamı= " + toplam);}
    }


}
