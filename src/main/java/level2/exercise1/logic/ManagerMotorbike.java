package level2.exercise1.logic;

import com.fasterxml.jackson.annotation.JsonProperty;
import level2.exercise1.annotation.JsonSerializableField;
import level2.exercise1.dataClass.Motorbike;

import java.util.ArrayList;
import java.util.List;

@JsonSerializableField(directory = "src/main/resources/Motorbike.json")
public class ManagerMotorbike {
    @JsonProperty("motorbikeList")
    private List<Motorbike>motorbikeList;

    public ManagerMotorbike(){
        this.motorbikeList = new ArrayList<>();
    }

    public void loadClass(){

        motorbikeList.add(new Motorbike("Yamaha", "YZF-R3", 321));
        motorbikeList.add(new Motorbike("Kawasaki", "Ninja 400", 399));
        motorbikeList.add(new Motorbike("Suzuki", "GSX-R750", 750));
        motorbikeList.add(new Motorbike("Ducati", "Panigale V2", 955));
        motorbikeList.add(new Motorbike("BMW", "S1000RR", 999));
        motorbikeList.add(new Motorbike("Triumph", "Speed Triple RS", 1160));
        motorbikeList.add(new Motorbike("KTM", "RC 390", 373));
        motorbikeList.add(new Motorbike("Harley-Davidson", "Iron 883", 883));
        motorbikeList.add(new Motorbike("Aprilia", "RS660", 659));
        motorbikeList.add(new Motorbike("Honda", "CBR600RR", 599));

    }
    public void printMotorbike(){
        for (Motorbike motorbike: motorbikeList){
            System.out.println("Motorbike: \n" +
                                "Name: " +motorbike.getName()+"\n"+
                                "Model: "+motorbike.getModel()+"\n"+
                                "C.C: "+ motorbike.getCC());
        }
    }
}
