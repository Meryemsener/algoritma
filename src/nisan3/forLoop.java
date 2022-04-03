package nisan3;

public class forLoop {
    public static void main(String[] args) {
        //x ve y tam sayilari arasinda kalan sayilardan 3'e bolunebile
        //sayilarin toplamini bulan (y>x)
        int x=20;
        int y=24;
        int sum=0;
        for(int i=x+1; i<y;i++){
            sum=sum+i;
        }
        System.out.println("toplam = "+sum);
    }

}
