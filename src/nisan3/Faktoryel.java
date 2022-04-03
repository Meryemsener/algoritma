package nisan3;

public class Faktoryel {
    public static void main(String[] args) {
        //n faktoryeli bulan programi yaziniz
        int N=14;
        long faktoryel=1;

        for (int i=1; i<N+1; i++){
            faktoryel=faktoryel*i;
        }
        System.out.println(faktoryel);
    }
}
