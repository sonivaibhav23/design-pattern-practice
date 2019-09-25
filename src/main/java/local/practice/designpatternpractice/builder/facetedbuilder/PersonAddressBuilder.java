package local.practice.designpatternpractice.builder.facetedbuilder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String street) {
        person.street = street;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }

    public PersonAddressBuilder withPostal(String postalCode) {
        person.postalCode = postalCode;
        return this;
    }
}
