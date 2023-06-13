public class Sedan extends Car{
    private boolean isElectric;

    public Sedan(String carMake, String carModel, int carPrice, boolean isElectric) {
        super(carMake, carModel, carPrice);
        this.isElectric = isElectric;
    }
    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "isElectric=" + isElectric +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
