public class Car {
    private Chassis chassis;
    private CarBody carbody;
    private String firm;
    private String model;
    private String colour;

    public Car(Chassis chassis,CarBody carbody, String firm, String model, String colour) {
        this.firm = firm;
        this.model = model;
        this.colour = colour;
        this.chassis = chassis;
        this.carbody = carbody;
    }

    public String getModel(){
        return this.model;
    }

    public Chassis getChassis(){
        return chassis;
    }

    public CarBody getCarBody(){ return carbody;}


    public static void main(String[] args){
        Car car = new Car(new Chassis(true), new CarBody("SUV"),"honda", "civic", "silver");

        System.out.println(car.getModel());
        System.out.println(car.getChassis().getChassis());
        System.out.println(car.getCarBody().getType());
    }
}
