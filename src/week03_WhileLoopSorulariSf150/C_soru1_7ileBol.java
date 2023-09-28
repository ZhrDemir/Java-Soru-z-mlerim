package week03_WhileLoopSorulariSf150;

public class C_soru1_7ileBol {

    public static void main(String[] args) {

        // Soru1: 2 bas 7 ile böl poz tam sayıları yazdır

        int sayi=10;
        System.out.print("7ile bölünebilen iki bas poz tam sayılar = ");

        while (sayi<100){
            if (sayi % 7 == 0){
                System.out.print(sayi + " ");
            }sayi ++;

        }



    }
}
