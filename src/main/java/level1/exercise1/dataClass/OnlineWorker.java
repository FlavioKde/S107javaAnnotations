package level1.exercise1.dataClass;


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
