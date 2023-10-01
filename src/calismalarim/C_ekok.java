package calismalarim;

public class C_ekok {
    public static void main(String[] args) {
        // EKOK bulma

        int n1 = 60, n2 = 160, ekok;

        ekok= Math.max(n1, n2);

        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.printf("%d ve %d sayılarının EKOK'u %d dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        }
    }
}





