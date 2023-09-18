package homework_nr_5;

import java.math.BigInteger;
import java.util.Arrays;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i <= 100; i++) {
            numbers[i] = 100 - i;
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println(numbers[i]);
        }
        int sum = 0;
        BigInteger product = BigInteger.valueOf(1);
        for (int i = 0; i <= 100; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                BigInteger x = BigInteger.valueOf(numbers[i]);
                product = product.multiply(x);
            }
        }
        System.out.println(sum);
        System.out.println(product);

        int[] copyNumbers = new int[101];


//        for (int i = 0; i <= 100; i++) {
//            copyNumbers[i] = numbers[i];
//        }
//        or
        copyNumbers = Arrays.copyOf(numbers, 101);
        System.out.println(copyNumbers[8]);
    }
}
