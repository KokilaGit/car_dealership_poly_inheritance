package solved;

import java.util.ArrayList;

public class CarDealership {

    private ArrayList<Car> inventory = new ArrayList<>();
    private int moneyMade = 0;

//    CarDealership(){
//        this.inventory = new ArrayList<>();
//    }

    public void addCar(Car car){
        this.inventory.add(car);
    }

    public void sellCar(Car car){
        this.moneyMade += car.getPrice();
        this.inventory.remove(car);
    }

    public int getInventoryCount(){
        return this.inventory.size();
    }

    public static void main(String[] args) {
        CarDealership tonysCarSales = new CarDealership();

        Car car1 = new Car("toyota", "camry", 12000);
        Car car2 = new SUV("jeep", "cherokee", 15000, true);
        Car car3 = new Sedan("kia", "rio", 800, false);

        tonysCarSales.addCar(car1);
        tonysCarSales.addCar(car2);
        tonysCarSales.addCar(car3);

        System.out.println(tonysCarSales.inventory);
        System.out.println(tonysCarSales.getInventoryCount());
        System.out.println(tonysCarSales.moneyMade);

        tonysCarSales.sellCar(car1);
        tonysCarSales.sellCar(car2);
        tonysCarSales.sellCar(car3);


        System.out.println(tonysCarSales.inventory);
        System.out.println(tonysCarSales.getInventoryCount());
        System.out.println(tonysCarSales.moneyMade);

    }
}




//3. **Create the CarDealer class:** Now, in the `CarDealership` class add an `ArrayList` of `Car` objects to represent the `inventory`.
//
//        4. **Add methods to CarDealer:** Add the following methods to the `CarDealer` class:
//        - An `addCar()` method that takes a `Car` object and adds it to the `inventory`.
//        - A `sellCar()` method that takes a `Car` object and removes it from the `inventory`.
//        - A `getInventoryCount()` method that returns the current number of cars in the `inventory`.

