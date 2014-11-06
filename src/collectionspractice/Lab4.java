package collectionspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jmiller
 */
public class Lab4 {
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
        Set<Employee> set = new HashSet<>(employees);
        employees = new ArrayList<>(set);
        

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println(employees.size());
    }
       
}
