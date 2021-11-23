import java.util.ArrayList;

public class Client_Storage extends Storage{
    protected int Rides_Offers[];
    protected static ArrayList<Registration> Client = new ArrayList<Registration>();
    @Override
    public void Add(Registration c){
        Client.add(c);
    }

    @Override
    public void get(int i) {
        System.out.println("----------------------------");
        System.out.println(Client.get(i).getName());
        System.out.println(Client.get(i).getMobile_Number());
        System.out.println(Client.get(i).getEmail());
    }
    public String getName(int i)
    {
        return Client.get(i).getName();
    }
    public String getPassword(int i)
    {
        return Client.get(i).getPassword();
    }
    @Override
    public int get_size() {
        return Client.size();
    }

    
}
