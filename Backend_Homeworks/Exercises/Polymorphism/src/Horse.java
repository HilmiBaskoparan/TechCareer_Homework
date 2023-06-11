public class Horse extends Animal{
    
    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return super.getName() + " is neighing" ; 
    }
    
    
    
}
