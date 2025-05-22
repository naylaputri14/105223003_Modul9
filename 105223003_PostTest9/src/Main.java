class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public double calculateSalary(boolean withBonus) {
        double baseSalary = calculateSalary();
        if (withBonus) {
            return baseSalary + getBonus();
        }
        return baseSalary;
    }

    protected double getBonus() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("\nNama: " + name);
        System.out.println("Gaji bulanan (tanpa bonus): Rp " + calculateSalary());
        System.out.println("Gaji bulanan (dengan bonus): Rp " + calculateSalary(true));
    }
}

class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 6000000;
    }

    @Override
    protected double getBonus() {
        return 2000000;
    }
}

class DataScientist extends Employee {
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 7000000;
    }

    @Override
    protected double getBonus() {
        return 2500000;
    }
}

class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 3000000;
    }

    @Override
    protected double getBonus() {
        return 500000;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Augustine"),
            new DataScientist("Betty"),
            new Intern("Inez")
        };

        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}