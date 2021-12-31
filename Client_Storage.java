package testing;
import java.util.ArrayList;

public class Client_Storage extends Storage{
    protected static ArrayList<Registration> Client = new ArrayList<Registration>();
    public static ArrayList<ArrayList<String>> Source_Areas = new ArrayList<ArrayList<String>>();
    public static ArrayList<Trip> all_Offers = new ArrayList<Trip>();


    @Override
    public void Add(Registration c){
        Client.add(c);
    }

    @Override
    public Registration get(int i) {
        return Client.get(i);
    }
    @Override
    public int get_size() {
        return Client.size();
    }

    @Override
    public void delete(int i) {
        Client.remove(i);
    }
}
