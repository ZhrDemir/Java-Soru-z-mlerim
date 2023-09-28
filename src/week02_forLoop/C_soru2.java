package week02_forLoop;

import java.util.Scanner;

public class C_soru2 {
    public static void main(String[] args) {

        //kullanıcıdan poz tam sayı isteyin, 1den girilen sayıya kadar (dahil) 7 ile bölünebilen sayıları yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı girin:");
        int girilenSayi = scanner.nextInt();

        for ( int i = 1 ; i <= girilenSayi ; i++ ){
           if (i%7 == 0){
               System.out.println( i  );
           }
        }
    }
}
