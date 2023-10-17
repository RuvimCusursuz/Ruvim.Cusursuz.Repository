package homeWork_nr_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Months.values()));

        FuelTypes f1 = FuelTypes.BENZIN;
        FuelTypes f2 = FuelTypes.LPG;
        System.out.println(f1 + " is liquid = " + f1.isLiquidFuel());
        System.out.println(f2 + " is liquid = " + f2.isLiquidFuel());
        System.out.println("--------------------------------------");
        checkInteger(5, CheckInteger.CHECK_IF_NEGATIVE);
        checkInteger(4 , CheckInteger.CHECK_IF_POSITIVE);
        checkInteger(6 , CheckInteger.CHECK_IF_EVEN);
        checkInteger(6456, CheckInteger.CHECK_IF_OOD);
    }


        public static void checkInteger(Integer x, CheckInteger checkInteger){
            System.out.println(x + " is " + checkInteger + " = "  + checkInteger.getCheckInteger().apply(x));

    }
}
