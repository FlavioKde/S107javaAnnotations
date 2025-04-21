package level1.exercise2.dataClass;

import level1.exercise2.dataClass.Worker;

public class OnlineWorker extends Worker {
    private static final double internet = 16.3;

    public OnlineWorker(String name, String lastName, double hourlyPrice){
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
        return (getHourlyPrice() * hoursWorked)+internet;

    }


}
