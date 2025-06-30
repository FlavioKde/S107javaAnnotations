package level1.exercise2.mainManager;

import level1.exercise2.dataClass.OnSiteWorker;
import level1.exercise2.dataClass.OnlineWorker;
import level1.exercise2.logic.ManagerOnSiteWorker;
import level1.exercise2.logic.ManagerOnlineWorker;

@SuppressWarnings("deprecation")

public class MainWorker {

    public static void main(String[] args) {

        ManagerOnlineWorker managerOnlineWorker = new ManagerOnlineWorker();
        managerOnlineWorker.loadClass();
        managerOnlineWorker.calcularSalaryMethod();

        OnlineWorker onlineWorker = new OnlineWorker("Nim","Rios", 23.45);

        onlineWorker.calculateGasoline();
        onlineWorker.oldMethod();


        System.out.println("----------------------------------------------");

        ManagerOnSiteWorker managerOnSiteWorker = new ManagerOnSiteWorker();
        managerOnSiteWorker.loadClass();
        managerOnSiteWorker.calculateSalaryMethodWorker();

        OnSiteWorker onSiteWorker = new OnSiteWorker("Charly","Brown",12.54);

        onSiteWorker.oldMethod();
        onSiteWorker.isServiceAvailable();





    }
}