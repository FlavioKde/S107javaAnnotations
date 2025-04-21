package level1.exercise2.mainManager;

import level1.exercise2.dataClass.OnlineWorker;
import level1.exercise2.logic.ManagerOnSiteWorker;
import level1.exercise2.logic.ManagerOnlineWorker;

public class MainWorker {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        ManagerOnlineWorker managerOnlineWorker = new ManagerOnlineWorker();
        managerOnlineWorker.loadClass();
        managerOnlineWorker.calcularSalaryMethod();


        managerOnlineWorker.oldMethod();
        managerOnlineWorker.oldMethod2();

        System.out.println("----------------------------------------------");
     //   @SuppressWarnings("deprecation")
        ManagerOnSiteWorker managerOnSiteWorker = new ManagerOnSiteWorker();
        managerOnSiteWorker.loadClass();
        managerOnSiteWorker.calculateSalaryMethodWorker();


        managerOnSiteWorker.isServiceAvailable();
        managerOnSiteWorker.isServiceAvailableWorker();


    }
}