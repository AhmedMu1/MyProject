package testing;
public class Client_Controller extends Controller {

    public void C_Registration(String Name, String Password, long Mobile_Number, String Email) {
        CR.register(Name, Password, Mobile_Number, Email, " ", 0);
        CS.Add(CR);
    }

    public boolean C_Login(String Name, String Password) {
        L.Login(Name, Password);
        for (int i = 0; i < CS.get_size(); i++) {
            System.out.println(CS.get(i).getName());
            if (Name.equals(CS.get(i).getName()) && Password.equals(CS.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void Request_ride(String Source, String Destination) {
        T.setSource(Source);
        T.setDestination(Destination);
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
}
