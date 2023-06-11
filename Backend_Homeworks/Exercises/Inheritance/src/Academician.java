public class Academician extends Employee{
    
    private String branch;
    private String degree;
    
    public Academician(String name, String surname, String telephone, String branch, String degree) {
        super(name, surname, telephone);
        this.branch = branch;
        this.degree = degree;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public void attendLesson() {
        System.out.println( this.getName() + " attending lessons.");
    }
    
}
