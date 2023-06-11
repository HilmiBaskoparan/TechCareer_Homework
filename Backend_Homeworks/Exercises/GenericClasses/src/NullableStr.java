public class NullableStr {
    private final String value;

    public NullableStr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public boolean isNull() {
        return this.getValue() == null;
    }
    
    public void run() {
        if (isNull()) {
            System.out.println("Any values didn't attend to this variable.(NULL)");
        }else {
            System.out.println(this.getValue());
        }
    }
    
}
