package JavaClasses;

public class RangeCreditCard {

    public static void rangeCreditCardCustomers(int min, int max, Customers[] customers){
        System.out.println("Customer's list with range CC:");
        for (int i = 0; i < customers.length; i++){
            if(min < customers[i].getCreditCard() && customers[i].getCreditCard() < max){
                System.out.println(customers[i].getSurname() + " " + customers[i].getName()
                        + " " + customers[i].getSecondName());
            }
        }
    }
}
