package level1.exercise2.logic;

import level1.exercise2.dataClass.OnlineWorker;

import java.util.ArrayList;
import java.util.List;

public class ManagerOnlineWorker {
    private List<OnlineWorker>onlineWorkerList;

    public ManagerOnlineWorker(){
        this.onlineWorkerList = new ArrayList<>();
    }

    public List<OnlineWorker> getOnlineWorkerList() {
        return onlineWorkerList;
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
            onlineWorker.calculateSalary(40.0);
            System.out.println("Worker: \n" +
                               "name " +onlineWorker.getName()+"\n"+
                               "last name "+onlineWorker.getLastName()+"\n"+
                                "salary: "+ String.format("%.2f",onlineWorker.calculateSalary(40.0)));
        }

    }
    @Deprecated
    public int oldMethod(){
        int number = 32;

        return number;
    }
    @Deprecated
    public int oldMethod2(){
        int number = 32;

        return number;
    }


}
