package level1.exercise2.dataClass;


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
    @Deprecated(since = "0.03", forRemoval = true)
    public boolean isServiceAvailable(){
        return true;
    }

    @Deprecated(since = "0.1",forRemoval = true)
    public void oldMethod(){
        System.out.println("Another method is not in use");
    }

}
