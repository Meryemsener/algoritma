package nisan9;

public class VizeFinalSoruzu {
    //1=>2 vize ve 1 final notu verilen ogrencinin gecip kaldigini ekrana yazdirin
    //vizeler %25, final %50, gecme notu 60,
    //2=> verilen sayinin tek mi cift mi oldugunu bulup ekrana yazdiran kodu yaziniz

    public static void main(String[] args) {


    int vize1= (int) (Math.random()*101);
    int vize2= (int) (Math.random()*101);
    int finalNotu= (int) (Math.random()*101);
    int gecmeNotu= (int) (vize1*0.25+vize2*0.25+finalNotu*0.50);

    if(gecmeNotu<60){
        System.out.println("Basarisiz oldunuz");
    }else System.out.println("Tebrikler gectiniz");

    int sayi= (int) (Math.random()*101);
    if(sayi%2==0) {
        System.out.println("Sayi cifttir.");
    }else System.out.println("sayi tektir");
    }
    }

