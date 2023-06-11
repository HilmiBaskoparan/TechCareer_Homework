public class Nullable<T extends Number> {
    
    private final T value;
    
    public Nullable(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    
}
