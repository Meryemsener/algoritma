package nisan10;

public class AnaClass {
    public static void main(String[] args) {
        //OOP consept
        Adres adr = new Adres("kigili", "C", "5", "Ankara", "Turkiye");
        Ogrenci ogr=new Ogrenci();
        //bununla adres classindaki her seyi kullanabilirim
        /*adr.cadde="kigili";
        adr.block="C";
        adr.no="5";
        adr.sehir="Ankara";
        adr.ulke="Turkiye";*/// Bu kisim 6. satirda yazildigi icin artik gerek yok
        ogr.adi="neva";
        ogr.soyadi="sener";
        ogr.oAdres=adr;
        System.out.println(ogr.oAdres.sehir);

    }

}
