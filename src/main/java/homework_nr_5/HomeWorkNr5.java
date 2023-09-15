package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i <= 100; i++) {
            numbers[i]= 100 - i;
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println(numbers[i]);
        }
        int sum=0;
        int product = 1;
        for (int i = 0; i <= 100; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                product *= numbers[i];
            }
        }
            System.out.println(sum);
            System.out.println(product);

    }
}
