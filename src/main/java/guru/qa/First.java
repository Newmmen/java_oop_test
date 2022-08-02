package guru.qa;

public class First {

    public static void main(String[] args) {
        CarForSale car = new CarForSale(50000,5,"Ford");
        car.isNew();
        car.matchYearToMileage();
        car.nameModel();


    }

}
