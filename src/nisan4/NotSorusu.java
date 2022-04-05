package nisan4;

import java.util.Scanner;

public class NotSorusu {
    public static void main(String[] args) {
        //notlari matematiksel bir mantik ile aciklamayi seven bir ogretmen, sira ile
        //ilk ogrencinin notunu acikladiktan sonra, sonraki ogrencilerin notunu ise
        //kendinden bir onceki ogrencinin farki olarak veriyor
        //bu sinifin not ortalamasini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("notlari giriniz");
        int not;

        int n=5;
        int oncekiNot=70;
        int toplam=oncekiNot;
        double ortalama;

        for(int i=1; i<n; i++) {
            not=scan.nextInt();
            not=oncekiNot+not;
            toplam+=not;
            oncekiNot=not;

        }
        System.out.println(ortalama = 1.0 * toplam / n);


    }
}
