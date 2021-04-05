public abstract class CarEquipment {
    public enum TypeEquipment {
        exclusive,
        standard,
        comfort
    }
    public String[] extraEquipment = new String[100];

    public CarEquipment(String[] extraEquipment) {
        this.extraEquipment = extraEquipment;
    }

    public abstract  String showElements();
}
