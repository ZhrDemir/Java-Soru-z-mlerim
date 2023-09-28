package week02_forLoop;

import java.util.Scanner;

public class C01_ornek {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif başlangıç değeri girin");
        int bas = scanner.nextInt();
        System.out.println("Lütfen bitiş için pozitif bir sayı girin");
        int bitis = scanner.nextInt();

        int toplam = 0 ;
        if (bitis<bas ){
            System.out.println("yanlış girdiniz");}
            else {
            for (int i = bas; i <= bitis; i++) {
                toplam += i;

            } System.out.print("Toplam = " + toplam);
        }
    }
}
