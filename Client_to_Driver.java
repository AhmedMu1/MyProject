package testing;
public class Client_to_Driver extends Notification{


    @Override
    public void get_Notify() {
        System.out.println("Driver is: " + getName() + "\nPrice: " + getOffer() + "\nLocation: "  + getLocation() + "\nMobile Number: "  + getNumber());
    }

    @Override
    public void set_Notify(String Name, int Offer, String Location, long Number){
        super.set_Notify(Name, Offer, Location, Number);
    }
}
