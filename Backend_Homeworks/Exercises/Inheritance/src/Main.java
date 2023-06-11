public class Main {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Yunus", "Eker", "0555 555 55 55");
        
        Academician a1 = new Academician("Hilmi", "Başkoparan", "0555 111 22 33", "Java Software Engineer", "Senior");
        
        Servant s1 = new Servant("Ahmet", "Öztürk", "0535 999 99 99", "Rector", "8");
        
        ResearchAssistant r1 = new ResearchAssistant("Hacer", "Başkoparan", "0555 123 45 67", "", "Expert");
        
        r1.attendLesson();
        r1.attendMeeting();
        r1.makeQuiz();
        
    }
}
