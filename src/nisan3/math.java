package nisan3;

public class math {
    public static void main(String[] args) {


        int yas1 = 13;
        int yas2 = 19;
        int yasFarki = yas1 - yas2;//bu sonuc negatif cikar, ben her zaman manuel ayarlama yapamayacagima gore
        //bunu java nin yapmasiniistiyrum ve bana pozitif donsun istiyorum
        yasFarki = Math.abs(yasFarki);
        System.out.println("yas farki = " + yasFarki);//sonuc negatif de olsa mutlak degerli halini verir

        long sayi1=Math.round(10.4);//sayiyi yuvarlar

        double sayi3=Math.sqrt(29);//sayinin karekokunu bulur.

    }
}