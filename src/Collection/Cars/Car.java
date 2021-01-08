package Collection.Cars;

import Collection.Types.MarkCar;
import java.util.Objects;

abstract public class Car {
    private static int sumCars = 0;
    private int carID = sumCars++;

    private MarkCar mark;
    private String model;
    private double fuelCosts;
    private int maxSpeed;
    private double price;

    public Car(MarkCar mark, String model, double fuelCosts, int maxSpeed, double price) {
        this.mark = mark;
        this.model = model;
        this.fuelCosts = fuelCosts;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public MarkCar getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getFuelCosts() {
        return fuelCosts;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", mark=" + mark +
                ", model='" + model + '\'' +
                ", fuelCosts=" + fuelCosts +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carID == car.carID &&
                Double.compare(car.fuelCosts, fuelCosts) == 0 &&
                maxSpeed == car.maxSpeed &&
                Double.compare(car.price, price) == 0 &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, mark, model, fuelCosts, maxSpeed, price);
    }
}
