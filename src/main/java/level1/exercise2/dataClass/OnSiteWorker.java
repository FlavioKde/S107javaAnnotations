package level1.exercise2.dataClass;

import level1.exercise2.dataClass.Worker;

public class OnSiteWorker extends Worker {
    private static double gasoline = 35.0;

    public OnSiteWorker(String name, String lastName, double hourlyPrice){
        super(name, lastName, hourlyPrice);

    }

    @Override
    public double calculateSalary(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        if (getHourlyPrice() < 0) {
            throw new IllegalArgumentException("Hourly price cannot be negative.");
        }
        return (getHourlyPrice() * hoursWorked) + gasoline;

    }

}
