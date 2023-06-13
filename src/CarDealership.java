import java.util.ArrayList;

import java.util.*;
public class CarDealership {
    ArrayList<Car> carsInventory = new ArrayList<>();
    private int moneyMade = 0;
    //add method to add car to inventory
    public void addCar(Car car){
        carsInventory.add(car);
    }
    public void sellCar(Car removeCar){
        this.moneyMade += removeCar.getPrice();
        carsInventory.remove(removeCar);
    }
    public int getInventoryCount(){
        return carsInventory.size();
    }
    public static void main(String[] args) {
        CarDealership dealer1 = new CarDealership();

        Car accord = new Car("Honda","Accord",30000);
        dealer1.addCar(accord);
        System.out.println("Inventory count after adding accord: "+dealer1.getInventoryCount());

        Sedan toyota = new Sedan("Toyota","Camry",29000,true);
        dealer1.addCar(toyota);
        System.out.println("Inventory count after adding camry: "+dealer1.getInventoryCount());

        SUV acura = new SUV ("Acura","RDX",33000);
        dealer1.addCar(acura);
        System.out.println("Inventory count after adding acura: "+dealer1.getInventoryCount());

        dealer1.sellCar(accord);
        System.out.println("Inventory count after selling accord: "+dealer1.getInventoryCount());
        System.out.println(dealer1.carsInventory);
        System.out.println(dealer1.moneyMade);
    }
}
