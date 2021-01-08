package Collection.Cars;

import Collection.Types.DoorsType;
import Collection.Types.MarkCar;

public class DoorsCar extends Car {
    public DoorsType type;

    public DoorsCar(MarkCar mark, String model, double fuelCosts, int maxSpeed,
                    double price, DoorsType type) {
        super(mark, model, fuelCosts, maxSpeed, price);
        this.type = type;
    }

    public DoorsType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", type = " + type + "}");
    }
}
