package nisan5;

public class Array1 {
    public static void main(String[] args) {
        /*bir sinifa ait ders notlari veriliyor
        bu notlarin toplamini ve ortalamasini bulunuz

         */
        int [] numbers=new int[]{30,56,56,75,95,100,30,80,50};
        int sum=0;
        for(int i=0; i<numbers.length; i++) {
            sum=sum + numbers[i];
        }
        double avarage=sum*1.0/numbers.length;//1.0 ile carpmanin anlami, degeri ondalik hale cevir demek

        System.out.println("sum = "+sum);
        System.out.println("avarage = "+avarage);
    }
}
