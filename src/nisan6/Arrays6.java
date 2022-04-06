package nisan6;

public class Arrays6 {
    /*
    N elemanli bir tamsayi dizisi veriliyor, diziyi sondan basa dogru ters cevirin
    input={1,3,3,7,4,10,6}
    output={6,10,4,7,3,3,1}

     */
    public static void main(String[] args) {


    int[] sayilar=new int[]{1,3,3,7,4,10,6};
    int[] sayilar2=new int[sayilar.length];
        for(int i=0; i<sayilar.length; i++) System.out.print(sayilar[i]+ " "); System.out.println();;

    for(int i=0; i<sayilar.length; i++){
        sayilar2[sayilar.length-i -1]=sayilar[i];

    }
        for(int i=0; i<sayilar.length; i++) System.out.print(sayilar2[i]+ " "); System.out.println();;

    }
}