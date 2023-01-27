package lesson_18;

public class CarDriver <T extends Car> extends Driver{

    public CarDriver(String fullName, int experience) {
        super(fullName,DriverLicence.CAR_LICENCE,experience);
    }
}
