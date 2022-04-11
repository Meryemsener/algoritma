package nisan10;

public class forEachLoop {
    public static void main(String[] args) {
        int [] dizi=new int []{3,6,8,66,43,24,21};
        int toplam=0;
        for (int i=0; i<dizi.length; i++){
            int value=dizi[i];
            toplam+=value;
        }
        System.out.println("toplam = "+toplam);
        toplam=0;
        for (int value: dizi ) {
            toplam+=value;
        }
        System.out.println("toplam = "+toplam);
    }


}
