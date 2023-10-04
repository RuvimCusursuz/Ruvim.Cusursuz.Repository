package Homework_nr_10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n % 2 ==0;
        System.out.println(is(7,predicate));

        Consumer<String> consumer = text -> System.out.println(text);
        sout("i love you, baby", consumer);

        Function<Integer, Integer> function = x ->  x * x;
        System.out.println(multiplication( 5 , function));

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(random(supplier));
    }
    public static boolean is( Integer objekt, Predicate predicate){
        return  predicate.test(objekt);
    }

    public static void sout(String text, Consumer consumer){
        consumer.accept(text);
    }

    public static Integer multiplication(Integer x, Function function){
        return (Integer) function.apply(x);
    }

    public static Double random(Supplier supplier){
        return (Double) supplier.get();
    }
}
