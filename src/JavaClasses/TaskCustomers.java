package JavaClasses;

//Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
//
//        Создать массив объектов. Вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

public class TaskCustomers {
    public static void main(String[] args) {
        Customers[] customers = new Customers[5];
        customers[0] = new Customers(1, "Zuev", "Denis", "Yurevich",
                "Yuryuzan", 12345, 242323);
        customers[1] = new Customers(2, "Grechuschev", "Shasha", "Sergeevich",
                "Kundravy", 54321,7568567);
        customers[2] = new Customers(3, "Lukin", "Evgeny", "Aleksandrovich",
                "Nyazepetrovsk", 12344, 3253535);
        customers[3] = new Customers(4, "Chichilanov", "Nikita", "Anatolievuch",
                "Chelyabinsk", 33345, 674743);
        customers[4] = new Customers(5, "Shkirmontov", "Vitalii", "Sergeevich",
                "Chesma", 55512, 24235346);

        ListCustomers.listCustomers(customers);
        System.out.println();
        RangeCreditCard.rangeCreditCardCustomers(10000, 40000, customers);
    }
}
