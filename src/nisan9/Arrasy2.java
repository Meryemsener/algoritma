package nisan9;

public class Arrasy2 {
    /*
    Tam sayilardan olusan bir arrayimiz var. Bu arrayin ikili elemanlarinin (i,j) toplaminin
     verilen k elamanina  bolunebildigini kontrol eden bir kod yazin
    input=
    arr=[1,2,3,4,5,6]
    k=5;
    output= 3 adet ikili kritere uymaktadir. (bunlar [1,4],[2,3]ve [4,6]
     */
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6};
        int k=5;
        int result=0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if((arr[i]+arr[j])%k==0){
                    result++;
                }

            }

        }
        System.out.println(result);
    }


}
