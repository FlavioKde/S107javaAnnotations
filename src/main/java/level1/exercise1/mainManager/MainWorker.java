package level1.exercise1.mainManager;

import level1.exercise1.logic.ManagerOnSiteWorker;
import level1.exercise1.logic.ManagerOnlineWorker;

public class MainWorker {
    public static void main(String[] args) {
        ManagerOnlineWorker managerOnlineWorker = new ManagerOnlineWorker();
        managerOnlineWorker.loadClass();
        managerOnlineWorker.calcularSalaryMethod();
        System.out.println("----------------------------------------------");
        ManagerOnSiteWorker managerOnSiteWorker = new ManagerOnSiteWorker();
        managerOnSiteWorker.loadClass();
        managerOnSiteWorker.calculateSalaryMethodWorker();

    }
}
