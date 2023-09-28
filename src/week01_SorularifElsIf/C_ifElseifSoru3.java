package week01_SorularifElsIf;

import java.util.Scanner;

public class C_ifElseifSoru3 {
    public static void main(String[] args) {
        // soru3 : aldığı ürün adedi ve liste fiyatını iste,müşteri kartı olup olmadığını sor.
        // varsa 10 üründen fazla alırsa %20 ,yoksa %15 indirim yap.
        // kartı yoksa 10 üründen fazla alırsa %15 yoksa %10 indirim yap

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürünün adedi");
        int aded = scanner.nextInt();

        System.out.println("Lütfen liste fiyatını yazınız :");
        double fiyat = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı? Evet = E , Hayır = H");
        char kart = scanner.next().charAt(0);

        if (kart == 'E' && aded > 10 ) {
            System.out.println("indiriminiz % 20 = " +  fiyat*80/100 );}

        else if (kart == 'E' ) {
            System.out.println("indiriminiz % 15 = " + fiyat*85/100);}

        else if (kart == 'H' && aded>10) {
            System.out.println("indiriminiz %15 = "+ fiyat*85/100);}
        else System.out.println("indiriminiz % 10 = " + fiyat*90/100);




    }
}