package nisan10;

public class Adres {
    String cadde;
    String block;
    String no;
    String sehir;
    String sokak;
    String ulke;


    public Adres(String cadde) {
        this.cadde = cadde;
    }

    public Adres(){

    }


    public Adres(String kigili, String c, String s, String ankara, String turkiye) {
        this.cadde=cadde;
        this.block=block;
        this.no=no;
        this.sehir=sehir;
        this.ulke=ulke;
        this.sokak=sokak;
    }
}
