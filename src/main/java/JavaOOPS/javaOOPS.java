package JavaOOPS;

public class javaOOPS {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.getName());
//        System.out.println(vehicle.getColor());
//        System.out.println(vehicle.count);
//
//        Vehicle vehicle1 = new Vehicle("civic", "white", "2019", "honda","4100");
//        System.out.println(vehicle.getColor());
//        System.out.println();
//
//        vehicle1.setName("wagonR");
//        System.out.println(vehicle1.getName());
//        vehicle1.setColor("Silver");
//        System.out.println(vehicle1.getColor());
//        System.out.println(vehicle1.getSpeed());
//        System.out.println(vehicle.count);
//
//
//        Vehicle.getVehicle();

//        Car car1 = new Car("civic", "white", "2019", "honda","4100",false,true);
//        System.out.println(car1.getLedScreen());
//        System.out.println(car1.getName());


        Vehicle vehicle = new Vehicle("civic", "white", "2019", "honda","4100");
        System.out.println(vehicle.getInfo());
        Vehicle vehicle1 = new Car("civic", "white", "2019", "honda","4100",false,true);
        System.out.println(vehicle1.getInfo());
    }
}
