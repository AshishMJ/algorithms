package core_java.design_patterns.decorator;

/**
 * Created by ashishm on 20/5/18.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury car functionalities");
    }
}
