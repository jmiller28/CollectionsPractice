package collectionspractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jmiller
 */
public class Lab5 {
    public static void main(String[] args) {

        Employee ee1 = new Employee("Bob", "Smith", "333-33-3333");
        Employee ee2 = new Employee("John", "Smith", "444-44-4444");
        Employee ee3 = new Employee("Mary", "Smith", "555-55-5555");
        Employee ee4 = new Employee("Pete", "Smith", "555-55-5555");

        // Using an Employee ID integer as the key because there are duplicated 
        // ssn's in our data. The company I work for actually allows duplicate ssn's 
        // in a table used for temp labor employees due to different agencies
        // supplying us with numbers already used elsewhere. 
        
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1, ee1);
        employees.put(2, ee2);
        employees.put(3, ee3);
        employees.put(4, ee4);

        System.out.println(employees.size());
        
        Set<Integer> keys = employees.keySet();
        for(Integer key : keys) {
            Employee employee = employees.get(key);
            System.out.println(employee);
        }
        
        Collection<Employee> values = employees.values();
        for(Employee employee : values) {
            System.out.println(employee);
        }
        
        
        System.out.println(employees.size());
    }
}
