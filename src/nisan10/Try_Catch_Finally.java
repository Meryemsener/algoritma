package nisan10;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        //try cach durumu bir kodun icinde hata varsa bu hatayi direkt hata olarak
        // soylemeyip hatayi yakalamasi durumudur
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayiyi yaziniz = ");//sayi istiyoruz ancak kullanici harf girdi
        //konsolda hata verir ve biz bu hatayi gormek istemiyoruz
        //bunun icin try catch acip kullanicidan isteyecegimiz degeri trin body si icine yaziyoruz
        int sayi = 0;
        try {//burayi oku
            sayi = scanner.nextInt();//burayi int sayi =scanner.nextInt olarak tanimlayinca
            //int i scope un disina alip bir deger atamani bekler, cunku ya okuyamazsam
            //diye dusunur ve int e scope disinda bir atama bekler
        } catch (Exception e) {//try i okuyamazsan buraya gel
            System.out.println("e = " + e);
            System.out.println("hatali giris");
        } finally {
            System.out.println("try catch sonlandi");
        }
        System.out.println("sayi = " + sayi);//eger int e scope disinda bir atama yapilmazsa buradaki sayi hata verir

    }
}
//ozellikle disari ile baglanti varsa bu yol kullanilir