package org.campus02.lahovnik.car;

public class CarDemoApp {
    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf5_G_876TU = new Car(); // damit wird ein Objekt von org.campus02.lahovnik.car.Car erstellt
        Car fiatPanda_G_123RU = new Car();

        golf5_G_876TU.setManufacturer("Volkswagen");
        golf5_G_876TU.setModel("Golf V");
        golf5_G_876TU.setHorsePower(90);
        golf5_G_876TU.setColour("black");
        golf5_G_876TU.setCo2Emission( 300);

        fiatPanda_G_123RU.setManufacturer("FIAT");
        fiatPanda_G_123RU.setModel("Panda");
        fiatPanda_G_123RU.setColour("red");
        fiatPanda_G_123RU.setHorsePower(75);
        fiatPanda_G_123RU.setCo2Emission(120);

         Car golf5_LB_345LX;
        golf5_LB_345LX = new Car();
        golf5_LB_345LX.initialize("Volkswagen",
                "black", 1980, "Golf I");


        System.out.println("Golf 5 aus Graz: " + golf5_G_876TU.getModel());
        System.out.println("Fiat: " + fiatPanda_G_123RU.getModel());

        golf5_G_876TU.accelerate(15);
    }
}
