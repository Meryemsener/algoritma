package nisan9;

public class IfElse {
    public static void main(String[] args) {
        /*
        1-verilen sayinin pozifit, negatif veya sifir oldugunu ekrana yazdiran bir kod yazin
        2-Verilen 4 sayinin en buyugunu ekrana yazdiran kod yaziniz
         */
        int sayi= (int) (Math.random()*101);
        if(sayi==0){
            System.out.println("sayi sifirdir");
        }else if(sayi<0 ){
            System.out.println("sayiniz pozitiftir");
        }else System.out.println("sayiniz negatiftir.");

        int sayi1= (int) (Math.random()*101);
        int sayi2= (int) (Math.random()*101);
        int sayi3= (int) (Math.random()*101);
        int sayi4= (int) (Math.random()*101);
        int enBuyuk=sayi1;
        if(sayi2>enBuyuk){
            enBuyuk=sayi2;
            System.out.println("en buyuk sayi : "+sayi2);
        }else if(sayi3>enBuyuk){
            enBuyuk=sayi3;
            System.out.println("en buyuk sayi : "+sayi3);
        }else System.out.println("en buyuk sayi : "+sayi4);
        }
    }
