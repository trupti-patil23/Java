package PrototypeDesignPattern;

public class Employee implements Prototype {
    private String name;
    private String department;
    private String role;
    private String officeLocation;

    public Employee(String name, String department, String role, String officeLocation) {
        this.name = name;
        this.department = department;
        this.role = role;
        this.officeLocation = officeLocation;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    // Clone method
    @Override
    public Employee clone() {
        return new Employee(this.name, this.department, this.role, this.officeLocation);
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", Department=" + department +
               ", Role=" + role + ", Office=" + officeLocation + "]";
    }
}

