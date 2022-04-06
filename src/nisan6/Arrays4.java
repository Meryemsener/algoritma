package nisan6;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        /*
        Ogretmen ogrencilerin defter ihtiyacini karsilamak icin sinifa X adet
        defter getirmistir. Ogrencilerin defter ihtiyaci azdan coga dogru sirali bir tamsayi
        dizisi olarak verilmisitr. Ogretmen en fazla kac ogrencinin defter ihtiyacini karsilayabilir
        (need[i]>0)
        input
        need [] ={1,3,3,5,6,10,20,50,100}

        output
        Defter ihtiyaci karsilanan ogrenci sayisi

                 */
        int need [] ={1,3,3,3,6,10,20,50,100};
        Scanner scan = new Scanner(System.in);
        int totalNotboek=scan.nextInt();
        int counter=0;
        for (int i=0; i<need.length;i++){
            if(need[i]<totalNotboek){
            totalNotboek=totalNotboek-need[i];
            counter++;
        }else break;
        }
        if(counter==need.length) System.out.println(counter+" ogrencinin defter ihtiyaci karsilanmis");
        else System.out.println(counter+" ogrencinin defter ihtiyaci karsilanmistir");//kimsenin karsilanmamistir
    }
}
