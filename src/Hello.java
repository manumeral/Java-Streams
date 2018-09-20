import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Mayank", 2000),
                new Employee(1, "Arif", 3000),
                new Employee(1, "Faisal", 4000),
        };
        Stream<Employee> employeeStream = Stream.of(employees);
        System.out.println(employeeStream);
        employeeStream.forEach(employee -> {
            System.out.println(employee.getName());
        });

        System.out.println(employeeStream);
    }
}

