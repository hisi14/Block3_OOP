package org.campus02.lahovnik.car;

// public => access modifier
// class => Schlüsselwort für Klasse
// org.campus02.lahovnik.car.Car => Klassenname
public class Car {
    // 4 access modifier
    // keinen => package protected
    // public => öffentlich
    // private => privat (nur innerhalb der Klasse)
    // protected => später
    private String manufacturer;
    private String colour;
    private int productionYear;
    private String model;
    private int horsePower;
    private double co2Emission;
    private int currentSpeed;

    public void initialize(String manufacturer, String colour, int productionYear, String model) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.productionYear = productionYear;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    //psvm => brauchen wir nicht
    public void setManufacturer(String manufacturer){
        // Parameter / lokale Varialben in Methoden, wie Attribute benennen
        // if (manufacturer == "Volkswagen")
        if (manufacturer.equals("Volkswagen")
                || manufacturer.equals("FIAT")) {
            this.manufacturer = manufacturer;
        }
        else {
            System.out.println("Falcher Hersteller");
        }
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void print() {
        System.out.println(this.manufacturer + ", "
                + this.productionYear);
    }

    public void accelerate() {
        currentSpeed += 10;
    }

    public void accelerate(int speed){
        currentSpeed += speed;
    }
}
