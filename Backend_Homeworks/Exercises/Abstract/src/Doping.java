public abstract class Doping {
    // Abstract Class
    
    protected double price;
    protected double[] taxes;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }
    
    // Abstract Method
    public abstract double calculate();
    
    
    
}
