package core_java.design_patterns.builder;

public class Address {
    private String pinCode;
    private String doorNumber;

    private String locality;
    private String landMark;

    private Address(AddressBuilder builder) {
        this.pinCode = builder.pinCode;
        this.doorNumber = builder.doorNumber;
        this.landMark = builder.landMark;
        this.locality = builder.locality;
    }

    public static class AddressBuilder {
        private String pinCode;
        private String doorNumber;

        private String locality;
        private String landMark;

        public AddressBuilder(String pinCode, String doorNumber) {
            this.pinCode = pinCode;
            this.doorNumber = doorNumber;
        }

        public AddressBuilder setPinCode(String pinCode) {
            this.pinCode = pinCode;
            return this;
        }

        public AddressBuilder setDoorNumber(String doorNumber) {
            this.doorNumber = doorNumber;
            return this;
        }

        public AddressBuilder setLocality(String locality) {
            this.locality = locality;
            return this;
        }

        public AddressBuilder setLandMark(String landMark) {
            this.landMark = landMark;
            return this;
        }

        public Address build() {
            final Address address = new Address(this);
            return address;
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode='" + pinCode + '\'' +
                ", doorNumber='" + doorNumber + '\'' +
                ", locality='" + locality + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}
