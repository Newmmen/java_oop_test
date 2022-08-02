package guru.qa;

public class CarForSale {
    int averageYearMileage = 17500;
    int inaccuracy = 7000;
    int mileage;
    int carAge;
    String model;

    public CarForSale(int mileage, int carAge, String model) {
        this.mileage = mileage;
        this.carAge = carAge;
        this.model = model;
    }

    void isNew() {
        if (mileage > 0) {
            System.out.println("New car");
        } else {
            System.out.println("Used car");
            System.out.println("Mileage = " + mileage);

        }
    }

    void matchYearToMileage() {
        if (returnSubtractionModule(mileage - (carAge * averageYearMileage)) < inaccuracy) {
            System.out.println("Пробег соответстует году");
            System.out.println("Пробег = " + mileage + " Ожидаемый пробег " + carAge * averageYearMileage);
        } else {
            System.out.println("Пробег не соответстует году");
            System.out.println("Пробег = " + mileage + " Ожидаемый пробег " + carAge * averageYearMileage);

        }
    }

    void nameModel() {
        System.out.println("Модель: " + model);
    }

    public int returnSubtractionModule(int value) {
        if (value < 0) {
            return -value;
        }
        return value;
    }

}

