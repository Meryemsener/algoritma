package nisan6;

public class Arrays6nin2yolu {
    /*
   N elemanli bir tamsayi dizisi veriliyor, diziyi sondan basa dogru ters cevirin
   input={1,3,3,7,4,10,6}
   output={6,10,4,7,3,3,1}

    */
    public static void main(String[] args) {


        int[] sayilar = new int[]{1, 3, 3, 7, 4, 10, 6};
        int[] sayilar2 = new int[sayilar.length];
        for (int i = 0; i < sayilar.length; i++) System.out.print(sayilar[i] + " ");System.out.println();
        int temp;

        for (int i = 0; i < (sayilar.length/2); i++) {//sayilar.length/2 demezsek diziyi iki defa turluyor ve hic bir degisiklik olmamis gibi bir sonuc aliyoruz
            temp=sayilar[i];

            sayilar[i] = sayilar[sayilar.length -i- 1];
            sayilar[sayilar.length - i-1]=temp;

        }
        for (int i = 0; i < sayilar.length; i++) System.out.print(sayilar[i] + " ");
        System.out.println();

    }
}
