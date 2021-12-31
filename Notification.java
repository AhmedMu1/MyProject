package testing;
public abstract class Notification {
    private String Name;
    private int Offer;
    private String Location;
    private long Number;
    public abstract void get_Notify();

    public String getName() {
        return Name;
    }

    public int getOffer() {
        return Offer;
    }

    public String getLocation() {
        return Location;
    }

    public long getNumber() {
        return Number;
    }
    public void set_Notify(String Name, int Offer, String Location, long Number){
        this.Name = Name;
        this.Offer = Offer;
        this.Location = Location;
        this.Number = Number;
    }
}
