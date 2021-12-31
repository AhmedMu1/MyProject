package testing;
public class Driver_Controller extends Controller{
    public void D_Registration(String Name, String Password, long Mobile, String Email, String Driver_License, long National_ID){
        DR.register(Name, Password, Mobile, Email, Driver_License, National_ID);
        AS.Add(DR);
    }
    public boolean D_Login(String Name, String Password){
        L.Login(Name, Password);
        for (int i = 0; i < DS.get_size(); i++) {
            if(Name.equals(DS.get(i).getName()) && Password.equals(DS.get(i).getPassword()))
                return true;
        }
        return false;
    }

    public void ListAllRides(String Name)
    {
        int index = 0;

        for (int i = 0; i < Driver_Storage.Favourite_Areas.size(); i++) {

            if(DS.get(i).getName().equals(Name))
            {
                index = i;
                break;
            }
        }
        int no = 1;
        for (int i = 0; i < Driver_Storage.Favourite_Areas.get(index).size(); i++) {
            for (int j = 0; j < Client_Storage.Source_Areas.size(); j++) {
                for (int k = 0; k < Client_Storage.Source_Areas.get(j).size(); k++) {
                    if(Driver_Storage.Favourite_Areas.get(index).get(i).equals(Client_Storage.Source_Areas.get(j).get(k)) )
                    {
                        System.out.println("---------------\n" + no++);
                        DC.set_Notify(CS.get(j).getName(),0,Client_Storage.Source_Areas.get(j).get(k),CS.get(j).getMobile_Number());
                        DC.get_Notify();
                    }
                }
            }
        }
    }
    public void select_ride(String DName, String CName, int offer){
        int Cindex = 0;
        for (int i = 0; i < CS.get_size(); i++) {
            if(CS.get(i).getName().equals(CName))
                Cindex = i;
        }
        int Dindex = 0;
        for (int i = 0; i < DS.get_size(); i++) {
            if(DS.get(i).getName().equals(DName))
                Dindex = i;
        }
        T.add(DName,CName, offer,T.getSource(), DS.get(Dindex).getMobile_Number());

        Client_Storage.all_Offers.add(T);

        //Client_Storage.Source_Areas.remove(Cindex);
    }
}
