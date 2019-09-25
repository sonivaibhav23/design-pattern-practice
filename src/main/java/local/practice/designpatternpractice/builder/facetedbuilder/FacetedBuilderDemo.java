package local.practice.designpatternpractice.builder.facetedbuilder;

public class FacetedBuilderDemo {

    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();

        Person person = builder.lives()
                    .at("123 London Street")
                    .in("London")
                    .withPostal("N34RHY")
                .works()
                    .at("Google")
                    .as("Software Engineer")
                    .earning(440000)
                .build();

        System.out.println(person);
    }
}
