public class Car {
    String make;
    String model;
    int price;
    //constructor
    public Car(String carMake,String carModel,int carPrice){
        this.make = carMake;
        this.model = carModel;
        this.price = carPrice;
    }

    //getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
