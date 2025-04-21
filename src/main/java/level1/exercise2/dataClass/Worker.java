package level1.exercise2.dataClass;

public abstract class Worker {
    private String name;
    private String lastName;
    private double hourlyPrice;

    public Worker(String name, String lastName, double hourlyPrice){
        this.name = name;
        this.lastName = lastName;
        this.hourlyPrice = hourlyPrice;

    }
    public abstract double calculateSalary(double hoursWorked);

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyPrice() {
        return hourlyPrice;
    }

    @Override
    public String toString() {
        return "Worker: " +"\n"+
                "name: " + name + '\n' +
                "lastName: " + lastName + '\n' +
                "hourlyPrice: " + hourlyPrice;
    }
}
