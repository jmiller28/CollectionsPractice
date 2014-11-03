package collectionspractice;

import java.util.*;

/**
 *
 * @author jmiller
 */
public class CollectionsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List hobbyItems = new ArrayList();
        hobbyItems.add("fishing pole");
        hobbyItems.add("tackle box");
        hobbyItems.add("live bait");

        //for (int i = 0; i < hobbyItems.size(); i++) {
        for (Object hobbyItem : hobbyItems) {
            System.out.println(hobbyItem);
        }

        Employee ee1 = new Employee("Bob", "Smith", "333-33-3333");
        Employee ee2 = new Employee("John", "Smith", "444-44-4444");
        Employee ee3 = new Employee("Mary", "Smith", "555-55-5555");
        Employee ee4 = new Employee("John", "Smith", "444-44-4444");
        
        List<Employee> employees = new ArrayList<>();
        employees.add(ee1);
        employees.add(ee2);
        employees.add(ee3);
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        Dog dog1 = new Dog("Fido", 1);
        
        List things = new ArrayList();
        things.add(ee3);
        things.add(ee2);
        things.add(dog1);
        
        for (Object thing : things) {
            System.out.println(thing);
        }
        
        Set<Employee> emps = new HashSet<>();
        emps.add(ee1);
        emps.add(ee2);
        emps.add(ee3);
        emps.add(ee4);
        
        for (Employee employee : emps) {
            System.out.println(employee);
        }
    }

}
