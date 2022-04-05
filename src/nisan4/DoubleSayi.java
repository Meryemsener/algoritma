package nisan4;

import java.util.Scanner;

public class DoubleSayi {
    public static void main(String[] args) {
        //2 ve 3 e bolunen(3'e bolunurken 2'ye tam bolunemeyen) sayilarin ortalamasini yazdirin
       Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

       int ikiyeBolunenler = 0;
        int uceBolunenler = 0;
        double ortalamaIki, ortalamaUc;
        int sayac2 = 0, sayac3 = 0;
        int sayi=0;
        for (int i = 0; i < N; i++) {
           // sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                ikiyeBolunenler += sayi;
                sayac2++;
            }
            if (sayi % 3 == 0 && sayi%2!=0) {
                uceBolunenler += sayi;
                sayac3++;
            }

        }
        ortalamaIki=ikiyeBolunenler/sayac2;
        ortalamaUc=uceBolunenler/sayac3;
       System.out.println(ortalamaIki);
       System.out.println(ortalamaUc);
    }
}
