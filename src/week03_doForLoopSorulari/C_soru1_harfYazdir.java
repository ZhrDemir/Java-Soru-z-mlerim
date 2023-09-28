package week03_doForLoopSorulari;

public class C_soru1_harfYazdir {
    public static void main(String[] args) {

        // 'k' harfinden 't' harfine kadar olan harfleri yazdir

        char harf = 'k';
        do {
            System.out.print(harf + " " );
            harf ++;

        }while (harf < 't');


    }
}
