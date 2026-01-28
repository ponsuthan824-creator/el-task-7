// Base class
class Employee {
    protected String name;
    protected int empId;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Method to calculate salary (to be overridden)
    double calculateSalary() {
        return 0.0;
    }

    void display() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    FullTimeEmployee(int empId, String name, double monthlySalary) {
        super(empId, name);   // using super keyword
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    PartTimeEmployee(int empId, String name, int hoursWorked, double ratePerHour) {
        super(empId, name);   // using super keyword
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

// Main class
public class PayrollDemo {
    public static void main(String[] args) {

        // Parent reference holding child objects
        Employee e1 = new FullTimeEmployee(101, "Ravi", 30000);
        Employee e2 = new PartTimeEmployee(102, "Anu", 40, 500);

        System.out.println("---- Payroll Summary ----");

        e1.display();
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}
