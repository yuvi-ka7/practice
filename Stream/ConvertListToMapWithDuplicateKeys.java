
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ConvertListToMapWithDuplicateKeys {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(103, "John"),
            new Employee(101, "David"),
            new Employee(102, "Smith"),
            new Employee(101, "Robert"),
            new Employee(103, "Martin")
        );

        // Group employees by ID and keep the IDs in sorted order
        Map<Integer, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getId,
                    TreeMap::new,
                    Collectors.toList()
                ));

        result.forEach((id, employeeList) ->
            System.out.println(id + " : " + employeeList)
        );
    }
}
