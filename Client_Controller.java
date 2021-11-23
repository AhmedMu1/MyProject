public class Client_Controller extends Controller{
    Notification n=new Client_to_Driver();
    Driver_Storage ds = new Driver_Storage();
    public void Request_Ride(){
        System.out.print("Enter Source: ");
        String source = input.next();
        System.out.print("Enter Destination: ");
        String Destination = input.next();
        Trip t = new Google_Maps_API(source, Destination);
        if(getFvAreaDriver(source))
        {
            n.Notify();
        }
        else
            System.out.println("There is no available drivers right now\nPlease wait.");
    }
}
