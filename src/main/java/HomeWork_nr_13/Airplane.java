package HomeWork_nr_13;

public class Airplane {
    private String mannufacturer;
    private String model;
    private  int nrOfIng;

    public Airplane(String mannufacturer, String model, int nrOfIng) throws InvalidAirplaneException{
        if (mannufacturer == null || mannufacturer.length() == 0)
            throw new InvalidManufacturerException("Manufacturer is invalid");
        this.mannufacturer = mannufacturer;

        if (model == null || model.length() == 0)
            throw new InvalidModelException("Model is invalid");
        this.model = model;

        if( nrOfIng == 0 || nrOfIng < 0)
            throw  new InvalidNrOfEnginesException("Engine can`t be  0 or  less that 0");
        this.nrOfIng = nrOfIng;
    }

    public String getMannufacturer() {
        return mannufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNrOfIng() {
        return nrOfIng;
    }
}
