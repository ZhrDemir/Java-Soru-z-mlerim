package week04_ArrayList_sf211;

import java.util.ArrayList;
import java.util.List;

public class C04_fibonacci {
    public static void main(String[] args) {

       // Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
       // sayisini bir list olarak donduren bir method olusturun


        int sayi = 13;

        System.out.println("İlk "+ sayi + " sayının Fibonacci sayı listesi  "+ fibonacciList(sayi));





    }

    public static List<Integer> fibonacciList(int sayi) {

        List<Integer> fibonacci = new ArrayList<>();

   if (sayi == 1){
            fibonacci.add(0);

        } else if (sayi==2) {
       fibonacci.add(0);
       fibonacci.add(1);

   }else {
       fibonacci.add(0);
       fibonacci.add(1);

       for (int i = 2; i < sayi ; i++) {
           fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
       }

   }
return fibonacci;

    }
}
