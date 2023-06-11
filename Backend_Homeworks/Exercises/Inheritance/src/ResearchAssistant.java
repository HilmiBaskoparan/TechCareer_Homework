public class ResearchAssistant extends Academician{
    
    private String doorNo;
    
    public ResearchAssistant(String name, String surname, String telephone, String branch, String degree) {
        super(name, surname, telephone, branch, degree);
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    
    public void attendMeeting() {
        System.out.println(this.getName() + " attended to the meeting.");
    }
    
    public void makeQuiz() {
        System.out.println(this.getName() + " made a test to students.");
    }
    
    
}
