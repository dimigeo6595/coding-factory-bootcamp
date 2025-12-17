package gr.aueb.cf.cf9.ch17.lifoParking;

public class Main {

    public static void main(String[] args) {

        LifoParking parking = new LifoParking();
        parking.addCar("AAA 6565");
        parking.addCar("IZT 1956");

        String car = parking.removeCar();
        System.out.println(car);

        car = parking.removeCar();
        System.out.println(car);



    }
}
