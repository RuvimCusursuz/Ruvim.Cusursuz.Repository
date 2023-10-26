package HomeWork_nr_13;

public class AnotherMane {
    public static void main(String[] args) throws InvalidRangeException {
        System.out.println( countvisibleBy7Numbers(7, 1));
    }

    public static int countvisibleBy7Numbers(int inferionLimit, int superiorLimit) throws InvalidRangeException {
        if (inferionLimit > superiorLimit) {
            throw new InvalidRangeException("first number is greater than last");
        }
        int count = 0;
        for (int i = inferionLimit;  i <= superiorLimit ; i++) {
            if (i % 7 == 0)
                count++;
        }
        return count;
    }
}
