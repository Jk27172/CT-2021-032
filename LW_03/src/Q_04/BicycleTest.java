package Q_04;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle("Janani", "0768765764");
        System.out.println("owner:" + myBike.getOwner().getOwnerName());
        System.out.println("Phone No: " + myBike.getOwner().getPhoneNo());
    }
}
