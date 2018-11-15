package core_java.designPatternTest;

import core_java.design_patterns.builder.Address;
import org.junit.Test;


public class BuilderTest {

    @Test
    public void test(){
        final Address address = new Address.AddressBuilder("577001", "630").setLocality("DVG").setLandMark("POST-OFFICe").build();
        System.out.println(address);
    }
}
