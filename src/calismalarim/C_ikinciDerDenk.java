package calismalarim;

import java.util.Scanner;

public class C_ikinciDerDenk {
    public static void main(String[] args) {
        // İkinci der denklemin köklerini bulma.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2 + bx + c = 0 ikinci der denklemin köklerini bulmak için " +
                                "denklemin katsayıları olan a, b ve c yi sırayla giriniz : ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double delta = b*b - 4*a*c ;


        if (delta>0){
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Girilen enklemin iki reel kökü vardır ve bunlar x1 = "+ x1+ "x2 = "+x2 ) ;
        } else if (delta==0) {
            double x1 = (-b) / (2 * a);
            System.out.println("Verilen denklemin eşit (çakışık)  iki reel kökü vardır ve bunlar x1 = x2 = "+ x1) ;
        }else{
            System.out.println("Verilen  denklemin  reel kökü yoktur.") ;
        }


    }
}
