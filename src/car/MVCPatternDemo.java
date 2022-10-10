package car;

import car.Car;
import car.CarController;
import car.CarView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Car model1 = retriveCarFromDatabase();

        CarView view = new CarView();

        CarController controller = new CarController(model1, view);

        controller.updateView();

        // update model data
        controller.setCarBrand("Porsche");
        controller.setCarModel("Cayenne");
        controller.setCarColour("Black");
        System.out.println("nAfter updating, Car Details are as follows");

        controller.updateView();
    }

    private static Car retriveCarFromDatabase() {
        Car car = new Car();
        car.setBrand("Dacia");
        car.setModel("1300");
        car.setColour("Blue");
        return car;
    }
}