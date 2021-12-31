
public class Client_UI extends Client_Controller {

    public void Print_Client(int index) {
        System.out.println("-------------------------------------\nName: " + CS.get(index).getName());
        System.out.println("Mobile Number: " + CS.get(index).getMobile_Number());
        System.out.println("Email: " + CS.get(index).getEmail());
    }

    public boolean Log_in(String Name, String Password) {
        if (C_Login(Name, Password)) {
            System.out.println("-------------------------------------\nLogin Successful");
            return true;
        }
        System.out.println("-------------------------------------\nLogin Fail");
        return false;
    }

    public void Set_Ride(String Name) {

        int index = 0;

        for (int i = 0; i < Client_Storage.Source_Areas.size(); i++) {

            if (CS.get(i).getName().equals(Name)) {
                index = i;
                break;
            }
        }

        System.out.println("-------------------------------------\nPlease, Enter your Source location");
        String S = input.next();
        Client_Storage.Source_Areas.get(index).add(S);
        System.out.println("Please, Enter your Destination location");
        String D = input.next();
        Request_ride(S, D);
    }

    public void printDriver(String Username) {
        Request_Driver(Username);
    }

    public void printPrice() {
        System.out.println(T.getOffer());
    }

    public void SelectDriver(String cname, String dname) {
        Trip.Ride.add(dname);
        Trip.Ride.add(cname);
        for (int i = 0; i < Client_Storage.all_Offers.size(); i++) {
            if (Client_Storage.all_Offers.get(i).getCName() == cname) {
                if (Client_Storage.all_Offers.get(i).getDName() != dname) {
                    Client_Storage.all_Offers.remove(i);
                }
            }
            if (Client_Storage.all_Offers.get(i).getDName() == dname) {
                if (Client_Storage.all_Offers.get(i).getCName() != cname) {
                    Client_Storage.all_Offers.remove(i);
                }
            }
        }
    }

    public void Rate(String Cname) {
        printPrevRides(Cname);
        System.out.println("-------------------------------------\nEnter the name of the driver: ");
        String dname = input.next();
        System.out.println("-------------------------------------\nEnter the Rate of the driver: ");
        int R = input.nextInt();
        ratePrevRide(dname, R);

    }
}
