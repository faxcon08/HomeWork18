package lesson_18;

abstract public class Transport<T extends Driver> {
    private DriverLicence licence = DriverLicence.NO_LICENCE;

    public DriverLicence getLicence() {
        return licence;
    }

    protected void setLicence(DriverLicence licence) {
        this.licence = licence;
    }

    /////// fields ///////
    private final String brand;
    private final String model;
    private final double engineVolume;


    ////////////////////////////////// class for default values ///////////////////////////
    protected static class Default_Values{
        static String default_brand = "default_brand";
        static String default_model = "default_model";
        static double default_engine_volume = 2.0;
    } // Default_Values

    /////// constructor /////
    public Transport(String brand, String model, double engineVolume) {

        this.brand = simpleCheckString(brand, Default_Values.default_brand);
        this.model = simpleCheckString(model, Default_Values.default_model);
        this.engineVolume = (engineVolume > 0) ? engineVolume : Default_Values.default_engine_volume;
    }// constructor

    /////// utility ////////

    protected String simpleCheckString(String forCheck, String default_value) {
        if(forCheck==null || forCheck.isBlank()) {
            System.out.println("Некорректный ввод. Значение будет измененено на: "+default_value);
            return default_value;
        }
        return forCheck.trim().replace("\\s+"," ");
    }
    @Override
    public String toString() {
        return String.format("Brand[%1$s], Model[%2$s], EngineVolume[%3$.1f]", brand, model, engineVolume);
    }
    /////// methods ///////

    abstract public void startMoving();

    abstract public void stopMoving();

    /////// getters //////

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    abstract public void setDriver(T driver);

    abstract public void printMessage();

    abstract public T getDriver();

    abstract void printType();

} // Transport
