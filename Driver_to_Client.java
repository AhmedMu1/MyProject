package testing;
public class Driver_to_Client extends Notification{

    @Override
    public void get_Notify() {
        System.out.println("Client is: " + getName() + "\nPrice: " + getOffer() + "\nLocation: "  + getLocation() + "\nMobile Number: "  + getNumber());
    }
    @Override
    public void set_Notify(String Name, int Offer, String Location, long Number){
        super.set_Notify(Name, Offer, Location, Number);
    }
}
