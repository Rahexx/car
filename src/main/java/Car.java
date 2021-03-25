public class Car {
    private String firm;
    private String model;
    private String colour;

    public Car(String firm, String model, String colour) {
        this.firm = firm;
        this.model = model;
        this.colour = colour;
    }

    public static void main(String[] args){
        Car car = new Car("honda", "civic", "silver");
    }
}
