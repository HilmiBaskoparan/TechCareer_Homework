
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        
        // ObjectOutputStream
        try {
            Car car = new Car("Hyundai", "Getz");
            FileOutputStream file = new FileOutputStream("output.txt");
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(car);
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // ObjectInputStream
        try {
            Car car = new Car("Hyundai", "Getz");
            FileOutputStream file = new FileOutputStream("output.txt");
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(car);

            // Nesneyi Okumak
            FileInputStream fileIn = new FileInputStream("output.txt");
            ObjectInputStream read = new ObjectInputStream(fileIn);

            // Reads the objects
            Car newCar = (Car) read.readObject();

            System.out.println("Car Brand : " + newCar.getBrand());
            System.out.println("Car Model: " + newCar.getModel());

            read.close();
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
