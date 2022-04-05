package nisan5;

public class Arrays {
    public static void main(String[] args) {
        int [] points=new int[]{50,44,65,95,85,30,20,90,30};
        System.out.println("poinst 2 ="+points[5]);//30 yazar
        int sum=points[3]+points[5];//iki elemanin toplami
        System.out.println("sum = "+sum);

        //3. elemani 5. elemana aktarmak,temp olusturarak
        int temp=points[3];
        points[3]=temp;
        points[3]=points[5];
        points[5]=temp;
        int sum1=points[3]+points[5];
        System.out.println("sum = "+ sum1);
    }
}
