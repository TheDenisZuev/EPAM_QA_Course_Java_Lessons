package Collection.Cars;

import java.util.Comparator;

public class FuelComparatorCar implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getFuelCosts() > car2.getFuelCosts()){
            return 1;
        } else if (car1.getFuelCosts() < car2.getFuelCosts()){
            return -1;
        } else {
            return 0;
        }
    }
}
