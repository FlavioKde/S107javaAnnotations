package level2.exercise1.mainManager;

import level2.exercise1.logic.JsonSerializer;
import level2.exercise1.logic.ManagerMotorbike;

public class MainMotorbike {
    public static void main(String[] args) {

        ManagerMotorbike managerMotorbike = new ManagerMotorbike();
        managerMotorbike.loadClass();
        managerMotorbike.printMotorbike();

        String Path = "src/main/resources/Motorbike.json";
        JsonSerializer.saveToFile(managerMotorbike,Path);
    }
}
