import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighestEmployeeUsingStreams {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "IT", 80000));
        employees.add(new Employee("Bob", "IT", 90000));
        employees.add( new Employee("Carol", "HR", 70000));

        Map<String, Optional<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)) ));

        map.forEach((dept, empOpt) -> {
            empOpt.ifPresent(emp ->
                    System.out.println(dept + " -> " + emp)
                );
            });


    }
}

class Employee{
    String name;
    String dept;
    int salary;

    Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", department='" + dept + '\'' +
               ", salary=" + salary +
               '}';
    }
    
}

