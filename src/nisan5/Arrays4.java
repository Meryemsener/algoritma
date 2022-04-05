package nisan5;

public class Arrays4 {
    public static void main(String[] args) {
        //verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
        //input={10,13,56,20,40,60,56,32}
        //output=60, 5
        int[] numbers = new int[]{10, 13, 56, 20, 40, 60, 56, 32};

        int buyukEleman = numbers[0], sira = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > buyukEleman) {
                buyukEleman = numbers[i];
                sira = i;

            }

        }
        System.out.println(buyukEleman);
        System.out.println(sira);

    }
}
