package level2.exercise1.dataClass;


import com.fasterxml.jackson.annotation.JsonProperty;
import level2.exercise1.annotation.JsonSerializableField;

public class Motorbike {
    @JsonProperty("name")
    private String name;
    @JsonProperty("model")
    private String model;
    @JsonProperty("CC")
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
