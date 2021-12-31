public class Driver_UI extends Driver_Controller{
    public void Print_Driver(int index){
        System.out.println("Name: " + DS.get(index).getName());
        System.out.println("Mobile Number: " + DS.get(index).getMobile_Number());
        System.out.println("Email: " + DS.get(index).getEmail());
        System.out.println("Driver License: " + DS.get(index).getDriver_License());
        System.out.println("National ID: " + DS.get(index).getNational_ID());
    }
    public boolean Log_in(String Name, String Password){
        if(D_Login(Name, Password)) {
            System.out.println("Login Succesful");
            return true;
        }
        else {
            System.out.println("Login Fail");
            return false;
        }
    }

    public void Add_Fav_Area(String Name,String Area)
    {
        int index = 0;

        for (int i = 0; i < Driver_Storage.Favourite_Areas.size(); i++) {

            if(DS.get(i).getName().equals(Name))
            {
                index = i;
                break;
            }
        }

        Driver_Storage.Favourite_Areas.get(index).add(Area);
    }

    public void printClient(String Name){
        ListAllRides(Name);
    }

    public void addPrice(int i, int o){
        T.setOffer(o);
    }

    public void showNotification(String Username)
    {
        System.out.println("Client: " + getClient(Username) + " has accepted your offer.");
    }

    public void endRide(String Username)
    {
        int index = 0;
        for (int i = 0; i < Trip.Ride.size(); i++) {
            if (Trip.Ride.get(i).equals(Username)) {
                index = i;
                break;
            }
        }
      
        Trip.Ride.remove(index);
        //Trip.Ride.remove(index+1);
        

        for (int i = 0; i < Client_Storage.all_Offers.size(); i++) {
            if(Client_Storage.all_Offers.get(i).getDName().equalsIgnoreCase(Username))
            {
                Trip.rideHistory.add(Client_Storage.all_Offers.get(i));
                setBalance(Username,Client_Storage.all_Offers.get(i).getOffer());
            }
            }
    }
    public void printBalance(String Username){
        getBalance(Username);
    }
}
