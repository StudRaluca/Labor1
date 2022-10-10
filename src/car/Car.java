package car;

public class Car {
    private String CarBrand;
    private String CarModel;
    private String CarColour;

    public String getBrand() {
        return CarBrand;
    }

    public void setBrand(String brand) {
        this.CarBrand = brand;
    }

    public String getModel() {
        return CarModel;
    }

    public void setModel(String model) {
        this.CarModel = model;
    }

    public String getColour() {
        return CarColour;
    }

    public void setColour(String colour) {
        this.CarColour = colour;
    }
}
