package local.practice.designpatternpractice.builder.fluentbuilderwithinheritence;

public class Person {

    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
