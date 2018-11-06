package core_java_test.design_patterns_test.serializationTest;

import core_java.serialization.Employee;
import core_java.serialization.SerializationUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by ashishm on 21/5/18.
 */
public class SerailzationTest {

    @Test
    public void test() {
        Employee employee = new Employee(123, "Ashish");
        final String fileName = "Employee.ser";

        try {
            SerializationUtil.serialize(employee, fileName);
            System.out.println("Before Serailization : " + employee);

            final Object o = SerializationUtil.deserialize(fileName);
            Employee deserializedEmployee = (Employee) o;
            System.out.println("After Deserilaziation : " + deserializedEmployee);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
