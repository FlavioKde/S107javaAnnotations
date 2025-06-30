package level3.exercise1.mainManager;

import level3.exercise1.exception.JsonSerializationException;
import level3.exercise1.logic.JsonSerializer;
import level3.exercise1.logic.ManagerMotorbike;

public class MainMotorbike {
    public static void main(String[] args){

        ManagerMotorbike managerMotorbike = new ManagerMotorbike();
        managerMotorbike.loadClass();
        managerMotorbike.printMotorbike();

        try {
            JsonSerializer.readAndSaveToFile(managerMotorbike);
        } catch (JsonSerializationException e) {
            System.err.println("Error serializing: " + e.getMessage());
        }


    }
}
