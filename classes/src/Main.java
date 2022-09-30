import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // referans tip
        CustomerManager customerManager= new CustomerManager(); // class çağrımı
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


    }
}

