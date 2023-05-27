package Vehicles;

class Garage {
    public static void main(String[] args) {
        
        Car car1 = new Car();

        car1.setCollor("Black");
        car1.setModel("Grand Cherokee 2020");
        car1.setTankCapacity(93.0);
        
        System.out.println(car1.getModel());
        System.out.println(car1.getCollor());
        System.out.println(car1.getTankCapacity() + "L");
        System.out.println("R$" + car1.totalTankValue(5.46));

        Car car2 = new Car("Red", "Gladiator Rubicon", 83.0);

        System.out.println("\n" + car2.getModel());
        System.out.println(car2.getCollor());
        System.out.println(car2.getTankCapacity() + "L");
        System.out.println("R$" + car2.totalTankValue(5.46));

        Truck truck1 = new Truck("Silver", "Volvo FH 540", 495.0);

        System.out.println("\n" + truck1.getModel());
        System.out.println(truck1.getCollor());
        System.out.println(truck1.getTankCapacity() + "L");
        System.out.println("R$" + truck1.totalTankValue(5.46));
    }
}
