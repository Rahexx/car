public class CarBody {
    private enum TypeBody {
        SUV,
        hatchback,
        cabriolet,
        combi,
        liftback
    }
    private String type;

    public CarBody(String type) {
        for(TypeBody userTypeBody : TypeBody.values()){
            if(userTypeBody.toString() == type){
                this.type = String.valueOf(userTypeBody);
            }
        }
    }

    public String getType(){
        return type;
    }
}
