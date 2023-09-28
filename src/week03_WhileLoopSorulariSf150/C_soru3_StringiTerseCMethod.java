package week03_WhileLoopSorulariSf150;

import java.util.Scanner;

public class C_soru3_StringiTerseCMethod {
    public static void main(String[] args) {

        // soru3: verilen bi stringi terse çevirip bize döndüren method

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz");
        String metin = scanner.nextLine();

        System.out.println(tersCevir(metin));




    }


      public static String tersCevir(String metin){
        String gmetin = metin, harf ="";
         int i=gmetin.length()-1;
        while (i>=0){
            harf += gmetin.charAt(i);

            i--;
        }
          return harf;
      }


}
