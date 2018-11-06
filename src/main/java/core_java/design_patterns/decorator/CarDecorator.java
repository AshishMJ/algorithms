package core_java.design_patterns.decorator;

/**
 * Created by ashishm on 20/5/18.
 */
public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }
}
