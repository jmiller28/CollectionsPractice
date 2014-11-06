package collectionspractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jmiller
 */
public class Lab3 {

    public static void main(String[] args) {

        Employee ee1 = new Employee("Bob", "Smith", "333-33-3333");
        Employee ee2 = new Employee("John", "Smith", "444-44-4444");
        Employee ee3 = new Employee("Mary", "Smith", "555-55-5555");
        Employee ee4 = new Employee("Pete", "Smith", "555-55-5555");

        List<Employee> employees = new ArrayList<>();
        employees.add(ee1);
        employees.add(ee2);
        employees.add(ee3);
        employees.add(ee4);

        System.out.println(employees.size());
        Employee ee5 = (Employee) (employees.get(1));
        System.out.println((ee5).toString());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.remove(1);
        employees.clear();
        System.out.println(employees.size());
    }
}
