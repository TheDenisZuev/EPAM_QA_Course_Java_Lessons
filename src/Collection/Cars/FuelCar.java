package Collection.Cars;

import Collection.Types.FuelType;
import Collection.Types.MarkCar;

public class FuelCar extends Car {
    private FuelType type;

    public FuelCar(MarkCar mark, String model, double fuelCosts, int maxSpeed,
                   double price, FuelType type) {
        super(mark, model, fuelCosts, maxSpeed, price);
        this.type = type;
    }

    public FuelType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", type = " + type + "}");
    }
}
