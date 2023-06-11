public class Main {
    public static void main(String[] args) {
        
        TopOfListDoping t1 = new TopOfListDoping(15000);
        System.out.println(t1.calculate());
        
        double[] taxes = {0.18, 0.8, 0.1, 0};
        UptodateDoping u1 = new UptodateDoping(15000, taxes);
        System.out.println(u1.calculate());
    }
}
