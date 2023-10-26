package homeWork_nr_12;

public enum FuelTypes {
    DIESEL,
    BENZIN,
    GASOLINE,
    LPG,
    METHAN,
    KEROSINE;

    public boolean isLiquidFuel(){
        return this == GASOLINE || this == KEROSINE || this == BENZIN || this == DIESEL;
    }

}
