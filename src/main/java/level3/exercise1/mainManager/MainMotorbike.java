package level3.exercise1.mainManager;

import level3.exercise1.logic.JsonSerializer;
import level3.exercise1.logic.ManagerMotorbike;
import java.io.IOException;

public class MainMotorbike {
    public static void main(String[] args)throws IOException {

        ManagerMotorbike managerMotorbike = new ManagerMotorbike();
        managerMotorbike.loadClass();
        managerMotorbike.printMotorbike();


        JsonSerializer.readAndSaveToFile(managerMotorbike,"MotorbikeReflex.json");
    }
}
