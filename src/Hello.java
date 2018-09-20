import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Employee 1", 2000),
                new Employee(1, "Employee 2", 3000),
                new Employee(1, "Employee 3", 4000),
                new Employee(1, "Employee 4", 5000),
                new Employee(1, "Employee 6", 6000),
        };
        Stream<Employee> employeeStream = Stream.of(employees);
        System.out.println(employeeStream);
        employeeStream
                .limit(3)
                .skip(1)
                .map(employee -> employee.getName().toUpperCase())
                .forEach(employee -> {
                    System.out.println(employee);
                });

        System.out.println(employeeStream);
    }
}

