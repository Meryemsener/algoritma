package nisan7;

public class Algoritma01 {
    public static void main(String[] args) {
     /*
      verilen n degerine   asagidaki sekli olusturun
      input=5
      output:
                                    #
                                #   #
                            #   #   #
                        #   #   #   #
                    #   #   #   #   #


*/

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.println("# ");
            }
            System.out.println();

        }
    }
}