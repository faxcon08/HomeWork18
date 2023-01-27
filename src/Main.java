import lesson_18.*;
public class Main {
    public static void printSeparator() {
        String separator = "--------------------------";
        System.out.println(separator + separator);
    }
    public static void main(String[] args) {
        Transport car1 = new Car("BMW", "X5", 2.5);
        Transport car2 = new Car("BMW", "X7", 3);
        Transport car3 = new Car("LADA", "XRAY", 2, BodyType.SEDAN);
        Transport car4 = new Car("hyundai", "SONATA", 1.5, BodyType.COUPE);
        System.out.println(car1);
        car2.printType();
        System.out.println(car3);
        car4.printType();

        printSeparator();

        Transport truck1 = new Truck("KAMAZ", "6511", 5);
        Transport truck2 = new Truck("KAMAZ", "4311", 4.5);
        Transport truck3 = new Truck("MAN", "TGS", 5, LoadCapacity.N1);
        Transport truck4 = new Truck("URAL", "4320", 5.2, LoadCapacity.N3);
        System.out.println(truck1);
        truck2.printType();
        System.out.println(truck3);
        truck4.printType();

        printSeparator();


        Transport bus1 = new Bus("Volvo", "7900", 4);
        Transport bus2 = new Bus("Liza", "6212", 3.4);
        Transport bus3 = new Bus("JAC", "HK6118G", 4, BusCapacity.SMALL);
        Transport bus4 = new Bus("LAZ", "CityLAZ-12LF", 3.2, BusCapacity.MIDDLE);
        System.out.println(bus1);
        bus2.printType();
        System.out.println(bus3);
        bus4.printType();

    }// main
}// MAIN