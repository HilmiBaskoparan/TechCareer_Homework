public class Servant extends Employee{
    
    private String department;
    private String workHours;
    
    public Servant(String name, String surname, String telephone, String department, String workHours) {
        super(name, surname, telephone);
        this.department = department;
        this.workHours = workHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }
    
    public void work() {
        System.out.println(this.getName() + " is working.");
    }
    
    
}
