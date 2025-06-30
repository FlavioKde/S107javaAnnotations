package level1.exercise1.logic;

import level1.exercise1.dataClass.OnlineWorker;

import java.util.ArrayList;
import java.util.List;

public class ManagerOnlineWorker {
    private List<OnlineWorker>onlineWorkerList;

    public ManagerOnlineWorker(){
        this.onlineWorkerList = new ArrayList<>();
    }

    public void loadClass() {
        onlineWorkerList.add(new OnlineWorker("Carlos","Apple", 13.56));
        onlineWorkerList.add(new OnlineWorker("Nim","Samsung", 23.78));
        onlineWorkerList.add(new OnlineWorker("Maria","Google", 17.89));
        onlineWorkerList.add(new OnlineWorker("Georginio","Xiaomi", 7.90));
    }
    public void printSalaries(){
        if (onlineWorkerList.isEmpty()) {
            System.out.println("No online worker available.");
            return;
        }
        for (OnlineWorker onlineWorker: onlineWorkerList){
            double salary =  onlineWorker.calculateSalary(40.0);
            System.out.println("On Line Worker: \n" +
                               "Name: " +onlineWorker.getName()+"\n"+
                               "Last name: "+onlineWorker.getLastName()+"\n"+
                                "Salary: "+ String.format("%.2f", salary));
        }

    }

}
