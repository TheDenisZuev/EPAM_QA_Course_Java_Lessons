package Collection.Cars;

import Collection.Types.BodyType;
import Collection.Types.MarkCar;

public class BodyCar extends Car {
    private BodyType type;

    public BodyCar(MarkCar mark, String model, double fuelCosts, int maxSpeed,
                   double price, BodyType type) {
        super(mark, model, fuelCosts, maxSpeed, price);
        this.type = type;
    }

    public BodyType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", type = " + type + "}");
    }
}
