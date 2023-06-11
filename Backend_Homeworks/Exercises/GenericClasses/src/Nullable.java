public class Nullable<T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    
    public boolean isNull() {
        return this.value == null;
    }
    
    public void run() {
        if (isNull()) {
            System.out.println("Any values didn't attend to this variable.(NULL)");
        }else {
            System.out.println(this.value);
        }
    }
    
}
