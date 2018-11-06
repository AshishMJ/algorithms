package core_java.design_patterns.decorator;

/**
 * Created by ashishm on 20/5/18.
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding super car functionalities");
    }
}
