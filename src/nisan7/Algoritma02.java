package nisan7;

public class Algoritma02 {
    public static void main(String[] args) {
        /*
        A ve B sinifina ait matematik notlari 2 ayri liste halinde verilmistir(Tam sayi olarak). Hangi sinif daha basarilidir?
        (basari kriteri siniftaki tum ogrencilerin notlarinin ortalamasinin diger
        sinif ortalamasinda yuksek olmasidir.

      girdi
      'A' integar dizisi
      'B' integar dizisi
      output
      Daha basarili sinifin adi:"A" veya "B"
      Not=Iki dizinin uzunlugu ayni oldugu icin ayni loop icinde ortalamalarini alin

//A sinifinin ortalamasini bul
//B sinifinin ortalamasini bul
//Buyuk olani ekrana yazdir

         */

        int[] A = new int[]{69, 95, 53, 76, 82, 65, 53, 87};
        int[] B = new int[]{96, 59, 35, 67, 28, 56, 92, 89};

        double toplamA = 0;

        for (int i = 0; i < A.length; i++) {
            toplamA = toplamA + A[i];
        }
        double ortalamaA=toplamA*1.0/A.length;

        double toplamB = 0;
        for (int i = 0; i < B.length; i++) {
            toplamB = toplamB + B[i];

        }
        double ortalamaB=1.0*toplamB/B.length;
        if(ortalamaB==ortalamaA) System.out.println("iki sinifin basarilisi esittir");
        else if (ortalamaB>ortalamaA) System.out.println("Daha basarili sinifin adi : B");
        else System.out.println("Daha basarili sinifin adi : A");
    }
}