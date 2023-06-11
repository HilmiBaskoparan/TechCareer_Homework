public class Employee {
    private String name;
    private String surname;
    private String telephone;

    public Employee(String name, String surname, String telephone) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public void entry() {
        System.out.println(this.name + " entered the university.");
    }
    
    public void exit() {
        System.out.println(this.name + " exited from university.");
    }
    
    public void messHall() {
        System.out.println(this.name + " entered the dining hall.");
    }
    
    
}
