package level1.exercise2.logic;

import level1.exercise2.dataClass.OnSiteWorker;

import java.util.ArrayList;
import java.util.List;

public class ManagerOnSiteWorker {
    private List<OnSiteWorker>onSiteWorkerList;

    public ManagerOnSiteWorker(){
        this.onSiteWorkerList = new ArrayList<>();
    }

    public void loadClass() {
        onSiteWorkerList.add(new OnSiteWorker("Peter","Peterovich",23.45));
        onSiteWorkerList.add(new OnSiteWorker("Perinola", "Wilson",12.34));
        onSiteWorkerList.add(new OnSiteWorker("Capito","Charly",34.67));
        onSiteWorkerList.add(new OnSiteWorker("Rosario","Di Gioia",12.45));
    }
    public void calculateSalaryMethodWorker(){
        if (onSiteWorkerList.isEmpty()){
            System.out.println("No on site worker available.");
            return;
        }
        for (OnSiteWorker onSiteWorker: onSiteWorkerList){
            double salary = onSiteWorker.calculateSalary(40.00);
            System.out.println("On site Worker: \n" +
                    "Name: " +onSiteWorker.getName()+"\n"+
                    "Last name: "+onSiteWorker.getLastName()+"\n"+
                    "Salary: "+ String.format("%.2f", salary));
    }
}

}

