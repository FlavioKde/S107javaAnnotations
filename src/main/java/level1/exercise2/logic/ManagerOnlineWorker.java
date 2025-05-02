package level1.exercise2.logic;

import level1.exercise2.dataClass.OnlineWorker;

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
    public void calcularSalaryMethod(){
        if (onlineWorkerList.isEmpty()) {
            System.out.println("No online worker available.");
            return;
        }
        for (OnlineWorker onlineWorker: onlineWorkerList){
            double salary = onlineWorker.calculateSalary(40.0);
            System.out.println("On line Worker: \n" +
                               "Name: " +onlineWorker.getName()+"\n"+
                               "Last name: "+onlineWorker.getLastName()+"\n"+
                                "Salary: "+ String.format("%.2f", salary));
        }

    }



}
