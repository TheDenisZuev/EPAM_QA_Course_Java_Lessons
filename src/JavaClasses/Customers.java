package JavaClasses;

public class Customers {
    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String address;
    private int creditCard;
    private int accountNumber;

    public Customers(){

    }
    public Customers(int id, String surname, String name, String secondName, String address, int creditCard,
                     int accountNumber){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.creditCard = creditCard;
        this.accountNumber = accountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
