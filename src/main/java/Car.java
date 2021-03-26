public class Car {
    private Chassis chassis;
    private CarBody carbody;
    private Engine engine;
    private String firm;
    private String model;
    private String colour;

    public Car(Chassis chassis,CarBody carbody, Engine engine, String firm, String model, String colour) {
        this.firm = firm;
        this.model = model;
        this.colour = colour;
        this.chassis = chassis;
        this.carbody = carbody;
        this.engine = engine;
    }

    public String getModel(){
        return this.model;
    }

    public Chassis getChassis(){
        return chassis;
    }

    public CarBody getCarBody(){ return carbody;}

    public Engine getEngine(){ return  engine; }

    public static void main(String[] args){
        Car car = new Car(new Chassis(true), new CarBody("SUV"), new Engine("1.4"),"honda", "civic", "silver");

        System.out.println(car.getModel());
        System.out.println(car.getChassis().getChassis());
        System.out.println(car.getCarBody().getType());
        System.out.println(car.getEngine().getPower());
    }
}
