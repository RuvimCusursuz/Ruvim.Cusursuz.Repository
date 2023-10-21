package HomeWork_nr_13;

public class Main {
    public static void main(String[] args) throws InvalidAirplaneException {
        Airplane boingX333 = new Airplane("Boing", "X333", 1);
        System.out.println(boingX333.getMannufacturer());

        createAirplaneEAFP("Airbus", "A330", 2);
        createAirplaneEAFP("Airbus", "A350", -4);
        createAirplaneEAFP("Tu", "154", 2);

        createAirplaneLByL(null, "A330", 2);
        createAirplaneLByL("Airbus", "A330", -8);
        createAirplaneLByL("Airbus", "A330", 2);

    }

    public static Airplane createAirplaneLByL(String manufacturer, String model, int numOfEn) throws InvalidAirplaneException {
        if (manufacturer == null || manufacturer.length() == 0) {
            System.out.println("Manufacturer is invalid");
            return null;
        }
        if (model == null || model.length() == 0) {
            System.out.println("Model is invalid");
            return null;
        }
        if (numOfEn == 0 || numOfEn < 0) {
            System.out.println("Engine can`t be  0 or  less that 0");
            return null;
        }
        return new Airplane(manufacturer, model, numOfEn);
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int numOfEn) {
        try {
            return new Airplane(manufacturer, model, numOfEn);
        } catch (InvalidAirplaneException e) {
            e.printStackTrace();
            return null;
        }
    }
}
