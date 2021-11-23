import java.util.ArrayList;

public class Driver_Storage extends Storage{
    protected ArrayList<ArrayList<String>> Favourite_Areas = new ArrayList<>();
    protected String[] Rides_History;
    protected static ArrayList<Registration> Drivers = new ArrayList<Registration>();

    @Override
    public void Add(Registration D) {
        Drivers.add(D);
    }

    @Override
    public void get(int i) {
        System.out.println("----------------------------");
        System.out.println(Drivers.get(i).getName());
        //System.out.println(Drivers.get(i).getPassword());
        System.out.println(Drivers.get(i).getMobile_Number());
        System.out.println(Drivers.get(i).getEmail());    }

    @Override
    public int get_size() {
        return Drivers.size();
    }

    @Override
    public String getPassword(int i) {
        return Drivers.get(i).getPassword();
    }

    @Override
    public String getName(int i) {
        return Drivers.get(i).getName();
    }

    public void addFvAreas(ArrayList<String> fv)
    {
        Favourite_Areas.add(fv);
    }
    public String getFvAreas(int driver,int area)
    {
        return Favourite_Areas.get(driver).get(area);
    }
    public int getFvAreasSize(int driver)
    {
        return Favourite_Areas.get(driver).size();
    }
}
