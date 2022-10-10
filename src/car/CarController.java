package car;

public class CarController {
    private Car model1;
    private CarView view;

    public CarController(Car model1, CarView view) {
        this.model1 = model1;
        this.view = view;
    }

    public void setCarBrand(String brand) {
        model1.setBrand(brand);
    }

    public String getCarBrand() {
        return model1.getBrand();
    }

    public void setCarModel(String model) {
        model1.setModel(model);
    }

    public String getCarModel() {
        return model1.getModel();
    }

    public void setCarColour(String colour) {
        model1.setColour(colour);
    }

    public String getCarColour() {
        return model1.getColour();
    }

    public void updateView(){
        view.printCarDetails(model1.getBrand(), model1.getModel(), model1.getColour());
    }
}
