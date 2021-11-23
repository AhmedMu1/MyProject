import java.util.ArrayList;



public class Admin_Storage extends Storage{
    protected static ArrayList<Registration> Pending_registrations = new ArrayList<Registration>();
    @Override
    public void Add(Registration A) {
        Pending_registrations.add(A);
    }
    
    
    @Override
    public void get(int i) {
        System.out.println("----------------------------");
        System.out.println(Pending_registrations.get(i).getName());
        System.out.println(Pending_registrations.get(i).getPassword());
        System.out.println(Pending_registrations.get(i).getMobile_Number());
        System.out.println(Pending_registrations.get(i).getEmail());
        /*System.out.println(Drivers.get(i).);
        System.out.println();*/
    }

    @Override
    public int get_size(){
        return Pending_registrations.size();
    }

    @Override
    public String getPassword(int i) {
        return null;
    }

    @Override
    public String getName(int i) {
        return null;
    }
}
