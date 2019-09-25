package local.practice.designpatternpractice.builder.fluentbuilderwithinheritence;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    SELF withName(String name) {
        person.name = name;
        return self();
    }

    protected SELF self() {
        return (SELF) this;
    }

    Person build() {
        return person;
    }
}
