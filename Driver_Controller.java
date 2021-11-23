public class Driver_Controller extends Controller{
    int offer;
    Driver_Storage s = new Driver_Storage();
    Notification n = new Driver_to_Client();
    public void Add_Fav_Area(String favourite){
    }
    public void suggest_price(int p){
        offer = p;
    }

    public int getOffer()
    {
        return offer;
    }

    public void ListAllRides()
    {
        for (int i = 0; i < t.getListSize(); i++) {
            t.getSource(i);
            System.out.println("Do you want to suggest a price ?\n1- Accept\n2- Decline");
            int ch = input.nextInt();
            if(ch == 1)
            {
                System.out.print("Enter your price");
                int sp = input.nextInt();
                suggest_price(sp);
            }
        }
        if(t.getListSize() == 0)
        {
            System.out.println("There is no available rides right now\nPlease wait");
        }
    }
}
