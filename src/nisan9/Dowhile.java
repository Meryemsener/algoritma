package nisan9;

public class Dowhile {
    public static void main(String[] args) {
        // bir sayi araligindaki tum sayilari , tek sayilari ve cift sayilari toplama
        int N=10;
        long toplamTek=0;
        long toplamCift=0;

        // while ile
        int toplam=0;
        int i=0;
        /*while(i<N+1){
            toplam=toplam+i;
            i++;
            if(i%2==0) toplamCift+=i;
            else toplamTek+=i;

        }*/
        //do while ile
        do {
            toplam = toplam + i;
            i++;
            if (i % 2 == 0) toplamCift += i;
            else toplamTek += i;
        }while(i<N+1);

        System.out.println("toplam : "+toplam);//buraya 11 i eklemedi ama tek sayi toplamina ekledi
        System.out.println("toplamCift : "+toplamCift);
        System.out.println("toplamTek : "+toplamTek);//neden 11 i de ekledi anlamadim
    }
}
//1 2 3 4 5 6 7 8 9 10