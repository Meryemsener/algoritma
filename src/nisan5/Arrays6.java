package nisan5;

public class Arrays6 {
    public static void main(String[] args) {
        //verilen bir tam syai dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilarin
        //toplamini bulunuz

        //inpur={10,13,56,20,40,60,56,32}
        //output=13+56+20+40
        int[] numbers = new int[]{10, 13, 56, 20, 40, 60, 56, 32};
        int buyukEleman = numbers[0], sira = 0;
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > buyukEleman) {
                buyukEleman = numbers[i];
                sira = i;


            }
        }

        int kucukEleman = numbers[0], sira2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < kucukEleman) {
                kucukEleman = numbers[i];
                sira2 = i;
            }
        }
        int sum = 0;
        if (sira < sira2) {
            for (int i = sira + 1; i < sira2; i++) {
                sum = sum + numbers[i];
            }

        } else
            for (int i = sira2 + 1; i < sira; i++) {
                sum = sum + numbers[i];
            }
        System.out.println(sum);


    }
}
