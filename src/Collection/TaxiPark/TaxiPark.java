package Collection.TaxiPark;

import Collection.Cars.Car;
import Collection.Cars.FuelComparatorCar;

import java.util.*;

public class TaxiPark {
    private String title;
    private List<? extends Car> cars;

    public TaxiPark(String title, List<? extends Car> cars) {
        this.title = title;
        this.cars = cars;
    }

    public String getTitle() {
        return title;
    }

    public List<? extends Car> getCars() {
        return cars;
    }

    public void print(Collection<? extends Car> collection){
        Iterator<? extends Car> iterator = collection.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }
    }

    public void getTotalPriceCars(){
        double totalPrice = 0;
        for (Car car: cars){
            totalPrice += car.getPrice();
        }
        System.out.println();
        System.out.println("Total price taxi park: " + totalPrice + "$");
    }

    public List<Car> getCarsMaxSpeed(int speedMin, int speedMax){
        List<Car> carsWithSpeed = new ArrayList<>();
        boolean hasCarsWithSpeed = false;
        for (Car car: cars){
            if (car.getMaxSpeed() > speedMin && car.getMaxSpeed() < speedMax){
                carsWithSpeed.add(car);
                hasCarsWithSpeed = true;
            }
        }
        String carsList = (hasCarsWithSpeed)
                ? "Cars with maximum speed to: " + speedMin + "km/h " + speedMax + "km/h"
                : "Cars with maximum speed to: " + speedMin + "km/h " + speedMax + "km/h";
        System.out.println();
        System.out.println(carsList);
        return carsWithSpeed;
    }

    public List<? extends Car> getCarsToFuelCosts(){
        System.out.println();
        System.out.println("List cars to fuel costs: ");
        Collections.sort(cars, new FuelComparatorCar());
        return cars;
    }
}
