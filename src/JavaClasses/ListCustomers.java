package JavaClasses;

import java.util.Arrays;
import java.util.Comparator;

public class ListCustomers {

    public static void listCustomers(Customers[] customers){
        Arrays.sort(customers, new Comparator<Customers>() {
            @Override
            public int compare(Customers o1, Customers o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        System.out.println("Customer's list:");
        for (Customers l:customers){
            System.out.println(l.getSurname() + " " + l.getName() + " " + l.getSecondName());
        }
    }
}
