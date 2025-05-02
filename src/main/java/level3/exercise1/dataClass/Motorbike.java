package level3.exercise1.dataClass;



public class Motorbike {

    private String name;

    private String model;

    private int CC;

    public Motorbike(String name, String model, int CC){
        this.name = name;
        this.model = model;
        this.CC= CC;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getCC() {
        return CC;
    }

    @Override
    public String toString() {
        return "Motorbike: " +"\n"+
                "name= " + name + '\n' +
                "model= " + model + '\n' +
                "CC=" + CC ;
    }
}
