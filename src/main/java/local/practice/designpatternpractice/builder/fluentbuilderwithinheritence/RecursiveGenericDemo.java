package local.practice.designpatternpractice.builder.fluentbuilderwithinheritence;

public class RecursiveGenericDemo {

    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder()
                .withName("Vaibhav")
                .worksAs("Software Developer");

        System.out.println(employeeBuilder.build());
    }
}
