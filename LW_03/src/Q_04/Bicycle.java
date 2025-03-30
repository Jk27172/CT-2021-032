package Q_04;

public class Bicycle {
    private Owner owner;

    public Bicycle(String ownerName, String phoneNo) {
        this.owner = new Owner(ownerName, phoneNo);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }
}
