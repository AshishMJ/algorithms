package core_java.designPatternTest;

import core_java.design_patterns.decorator.BasicCar;
import core_java.design_patterns.decorator.Car;
import core_java.design_patterns.decorator.LuxuryCar;
import core_java.design_patterns.decorator.SportsCar;
import org.junit.Test;

/**
 * Created by ashishm on 20/5/18.
 */
public class DecoratorTest {

    @Test
    public void testBasicCar() {
        Car car = new BasicCar();
        car.assemble();
    }

    @Test
    public void addLuxuryToBasicCar() {
        Car car = new LuxuryCar(new BasicCar());
        car.assemble();
    }

    @Test
    public void addSportsToBasicCar() {
        Car car = new SportsCar(new BasicCar());
        car.assemble();
    }

    @Test
    public void addingDualFunctionalities() {
        Car basicCar = new BasicCar();
        Car luxuryCar = new LuxuryCar(basicCar);
        Car sportsCar = new SportsCar(luxuryCar);
        sportsCar.assemble();

    }
}
