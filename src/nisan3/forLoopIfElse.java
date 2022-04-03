package nisan3;

public class forLoopIfElse {
    public static void main(String[] args) {
        //x ve y tam sayilari arasinda kalan ve 3ile bolunebilen sayilarin toplamini

        int x = 20;
        int y = 36;
        int sum = 0;
        int a,b;

        if (x > y) {
            for (int i = x + 1; i < y; i++) {
                sum = sum + i;

            }
        } else {
            for (int i = y + 1; i < x; i++) {
                sum=sum+i;

            }
        }
        //ya da
        if(y>x) {a=x;b=y;}else{b=x;a=y;}

        for(int i = a+1; i < b; i++) {
            sum=sum+i;
        }
        System.out.println(sum);


    }
}
