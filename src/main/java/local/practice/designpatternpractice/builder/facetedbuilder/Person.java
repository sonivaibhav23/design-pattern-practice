package local.practice.designpatternpractice.builder.facetedbuilder;

public class Person {

    // address
    public String street, city, postalCode;

    // employment
    public String company, position;
    public int salary;

    @Override
    public String toString() {
        return "Person{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
