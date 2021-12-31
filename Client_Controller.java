
public class Client_Controller extends Controller {

    public void C_Registration(String Name, String Password, long Mobile_Number, String Email) {
        CR.register(Name, Password, Mobile_Number, Email, " ", 0);
        CS.Add(CR);
    }

    public boolean C_Login(String Name, String Password) {
        L.Login(Name, Password);
        for (int i = 0; i < CS.get_size(); i++) {
            if (Name.equals(CS.get(i).getName()) && Password.equals(CS.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void Request_ride(String Source, String Destination) {
        T.setSource(Source);
        T.setDestination(Destination);
        System.out.println("The Time Taken to reach your destination (Using Harvesine) = " + (H.Calc_distance(Source, Destination)/60.0 + " Hours"));
    }

    public void Request_Driver(String Username) {
        int no = 1;

        for (int i = 0; i < Client_Storage.all_Offers.size(); i++) {

            if (Username.equals(Client_Storage.all_Offers.get(i).getCName())) {
                System.out.println("---------------\n" + no++);
                System.out.println("Driver Name: " + Client_Storage.all_Offers.get(i).getDName());
                System.out.println("Offer: " + Client_Storage.all_Offers.get(i).getOffer());
                System.out.println("Location: " + Client_Storage.all_Offers.get(i).getSource());
                System.out.println("Mobile Number: " + Client_Storage.all_Offers.get(i).getD_mo_no());
            }

        }
    }

    public void printPrevRides(String Username) {
        int no = 1;

        for (int i = 0; i < Trip.rideHistory.size(); i++) {
            if (Username.equals(Trip.rideHistory.get(i).getCName())) {
                System.out.println("---------------\n" + no++);
                System.out.println("Driver Name: " + Trip.rideHistory.get(i).getDName());
                System.out.println("Offer: " + Trip.rideHistory.get(i).getOffer());
                System.out.println("Location: " + Trip.rideHistory.get(i).getSource());
                System.out.println("Mobile Number: " + Trip.rideHistory.get(i).getD_mo_no());
            }

        }
    }

    public void ratePrevRide(String dname, int R) {
        for (int i = 0; i < Trip.rideHistory.size(); i++) {

            if (dname.equals(Trip.rideHistory.get(i).getDName())) {
                T.setRate(R);
            }

        }
    }
}
