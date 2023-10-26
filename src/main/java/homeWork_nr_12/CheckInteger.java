package homeWork_nr_12;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum CheckInteger {
    CHECK_IF_OOD((x) -> x % 2 == 1),
    CHECK_IF_EVEN ((x) -> x % 2 == 0),
    CHECK_IF_NEGATIVE ((x) -> x < 0),
    CHECK_IF_POSITIVE ((x) -> x > 0);

    private Function<Integer,Boolean> checkInteger;

    CheckInteger(Function<Integer,Boolean> checkInteger){
        this.checkInteger = checkInteger;
    }

    public Function<Integer, Boolean> getCheckInteger() {
        return checkInteger;
    }
}
