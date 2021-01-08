package Collection;

// Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//        Каждый класс должен иметь отражающее смысл название и информативный состав.
//        Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//        Наследование должно применяться только тогда, когда это имеет смысл.
//        При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//        Классы должны быть грамотно разложены по пакетам
//        Консольное меню должно быть минимальным.
//        Для хранения параметров инициализации можно использовать файлы.

import Collection.Cars.BodyCar;
import Collection.Cars.Car;
import Collection.Cars.DoorsCar;
import Collection.Cars.FuelCar;
import Collection.TaxiPark.TaxiPark;
import Collection.Types.BodyType;
import Collection.Types.DoorsType;
import Collection.Types.FuelType;
import Collection.Types.MarkCar;

import java.util.Arrays;
import java.util.List;

public class TaskCollections {
    static List<Car> cars = Arrays.asList(
            new FuelCar(MarkCar.CHEVROLET, "Spark", 3.8,
                    130, 10000.0, FuelType.SUBCOMPACT),
            new FuelCar(MarkCar.CHEVROLET, "Cruze", 6.2,
                    180, 20000.0, FuelType.COMPACT),
            new BodyCar(MarkCar.FORD, "Focus", 7,
                    185, 22000.0, BodyType.HATCHBACK),
            new DoorsCar(MarkCar.OPEL, "Corsa", 5,
                    170, 21000.0, DoorsType.FOUR_DOORS),
            new DoorsCar(MarkCar.RENAULT, "Modus", 4.8,
                    165, 12000.0, DoorsType.FIVE_DOORS)
    );

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark("Saturn", cars);
        System.out.println("Taxi park - " + taxiPark.getTitle());
        taxiPark.print(cars);
        taxiPark.getTotalPriceCars();
        taxiPark.print(taxiPark.getCarsMaxSpeed(130,165));
        taxiPark.print(taxiPark.getCarsToFuelCosts());
    }

}
