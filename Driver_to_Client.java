public class Driver_to_Client implements Notification{

    @Override
    public void Notify() {
        Driver_Controller c = new Driver_Controller();
        System.out.print("Driver: Suggested a price: " + c.getOffer());
    }
    
}
