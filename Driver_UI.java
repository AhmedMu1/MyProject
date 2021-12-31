package testing;
public class Driver_UI extends Driver_Controller{
    public void Print_Driver(int index){
        System.out.println("Name: " + DS.get(index).getName());
        System.out.println("Mobile Number: " + DS.get(index).getMobile_Number());
        System.out.println("Email: " + DS.get(index).getEmail());
        System.out.println("Driver License: " + DS.get(index).getDriver_License());
        System.out.println("National ID: " + DS.get(index).getNational_ID());
    }
    public void Log_in(String Name, String Password){
        if(D_Login(Name, Password))
            System.out.println("Login Succesful");
        else
            System.out.println("Login Fail");
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
}
