package level1.exercise2.logic;

import level1.exercise2.dataClass.OnSiteWorker;

import java.util.ArrayList;
import java.util.List;

public class ManagerOnSiteWorker {
    private List<OnSiteWorker>onSiteWorkerList;

    public ManagerOnSiteWorker(){
        this.onSiteWorkerList = new ArrayList<>();
    }

    public List<OnSiteWorker> getOnSiteWorkerList() {
        return onSiteWorkerList;
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
            onSiteWorker.calculateSalary(40.00);
            System.out.println("Worker: \n" +
                    "name " +onSiteWorker.getName()+"\n"+
                    "last name "+onSiteWorker.getLastName()+"\n"+
                    "salary: "+ String.format("%.2f",onSiteWorker.calculateSalary(40.00)));
    }
}
    @Deprecated(since = "0.03", forRemoval = true)
    public boolean isServiceAvailable(){
        return true;
    }
    @Deprecated(since = "0.1",forRemoval = true)
    public boolean isServiceAvailableWorker(){
        return false;
    }

}

