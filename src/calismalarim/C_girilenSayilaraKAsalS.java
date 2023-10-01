package calismalarim;

import java.util.*;

public class C_girilenSayilaraKAsalS {
    public static void main(String[] args) {

        //  Kullanıcı tarafından girilen sayıya kadar olan
        //  Asal Sayıları ekrana yazdıran bir kod yazınız


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ; ");
        int sayi = scanner.nextInt();

        List<Integer> asalList = new ArrayList<>();

        asalList.add(2);

        for (int i = 3; i <=sayi ; i++) {

            for (int j = 2; j <i ; j++) {

                if ( !(i % j == 0)){

                   if (!asalList.contains(i)) {

                       asalList.add(i);
                   }
            }else j=i;
           }
        }

        System.out.println(asalList);
    }
}
