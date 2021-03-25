public class Car {
    private Chassis chassis;
    private String firm;
    private String model;
    private String colour;

    public Car(Chassis chassis, String firm, String model, String colour) {
        this.firm = firm;
        this.model = model;
        this.colour = colour;
        this.chassis = chassis;
    }

    public String getModel(){
        return this.model;
    }

    public Chassis getChassis(){
        return chassis;
    }

    public static void main(String[] args){
        Car car = new Car(new Chassis(true),"honda", "civic", "silver");

        System.out.println(car.getModel());
        System.out.println(car.getChassis().getChassis());
    }
}
