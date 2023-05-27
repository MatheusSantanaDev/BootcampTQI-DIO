package Vehicles;


class Vehicle {
    String collor;
    String model;
    double tankCapacity;

    Vehicle(){

    }

    Vehicle(String collor, String model, double tankCapacity){
        this.collor = collor;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    void setCollor(String collor){
        this.collor = collor;
    }

    String getCollor(){
        return collor;
    }

    void setModel(String model){
        this.model = model;
    }

    String getModel(){
        return model;
    }

    void setTankCapacity(Double tankCapacity){
        this.tankCapacity = tankCapacity;
    }

    Double getTankCapacity(){
        return tankCapacity;
    }

    Double totalTankValue(double fuelValue){
        return (tankCapacity * fuelValue);
    }
}

