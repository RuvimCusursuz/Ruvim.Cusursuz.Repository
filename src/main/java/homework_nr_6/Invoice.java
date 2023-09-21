package homework_nr_6;

public class Invoice {
    private String model;
    private String produktDescription;
    private int quantityOfProduct;
    private double price;

    public Invoice(String model, String produktDescription, int quantityOfProduct, double price) {
        this.model = model;
        this.produktDescription = produktDescription;
        if (quantityOfProduct < 0) {
            this.quantityOfProduct = 0;
        } else {
            this.quantityOfProduct = quantityOfProduct;
        }
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProduktDescription() {
        return produktDescription;
    }

    public void setProduktDescription(String produktDescription) {
        this.produktDescription = produktDescription;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getAmount() {
        System.out.println(quantityOfProduct * price);
    }
}
