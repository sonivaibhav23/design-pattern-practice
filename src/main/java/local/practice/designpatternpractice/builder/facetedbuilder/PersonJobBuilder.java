package local.practice.designpatternpractice.builder.facetedbuilder;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String company) {
        person.company = company;
        return this;
    }

    public PersonJobBuilder as(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int salary) {
        person.salary = salary;
        return this;
    }
}
