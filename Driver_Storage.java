package testing;
import java.util.ArrayList;

public class Driver_Storage extends Storage{
    protected static ArrayList<Registration> Drivers = new ArrayList<Registration>();
    public static ArrayList<ArrayList<String>> Favourite_Areas = new ArrayList<ArrayList<String>>();
    
    
    @Override
    public void Add(Registration D) {
        Drivers.add(D);
    }

    @Override
    public Registration get(int i) {
        return Drivers.get(i);
    }
    @Override
    public int get_size() {
        return Drivers.size();
    }

    @Override
    public void delete(int i) {
        Drivers.remove(i);
    }
}
