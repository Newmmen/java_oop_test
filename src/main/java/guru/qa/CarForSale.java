package guru.qa;

public class CarForSale {
    String mileage;
    String model;


    //void addAge(int value) {
     //   this.age = age + value;
     //   System.out.println("Теперь мой возраст " +age );
 //   }

    public CarForSale(String mileage, String model) {
        this.mileage = mileage;
        this.model = model;
    }

    void isNew() {
        if (mileage.equals("0")) {
            System.out.println("New car");
        } else {
            System.out.println("Used car");
            System.out.println("Mileage = " + mileage);
        }
    }

    void nameModel() {
        System.out.println("Мое имя: " + model);
    }
}
