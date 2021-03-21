package JavaOOPS;

public class Car extends Vehicle {

    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car() {
    }

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public String getName()
    {
        return super.getName();
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    public boolean getPowerSteering() {
        return this.powerSteering;
    }

    public boolean getLedScreen() {
        return this.ledScreen;
    }

    public String getInfo()
    {
        return "this is car";
    }
}
