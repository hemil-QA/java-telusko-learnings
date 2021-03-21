package JavaOOPS;

public class Vehicle {

    private String name;
    private String color;
    private String model;
    private String company;
    private String engine = "800";
    public static int count = 0;

    public Vehicle() {
        count++;
    }

    public Vehicle(String name, String color, String model, String company, String engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public int getSpeed() {
        String a = getEngine();
        if (a == "800") {
            return 90;
        } else
            return 120;
    }

    public String getInfo()
    {
        return "this is vehicle";
    }

    public static String getVehicle() {
        System.out.println("You have set name and color of vehicle");
        return "Yo";
    }

}
