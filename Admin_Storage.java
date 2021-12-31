import java.util.ArrayList;

public class Admin_Storage extends Storage{
    
    protected static ArrayList<Registration> Pending_registrations = new ArrayList<Registration>();
    @Override
    public void Add(Registration A) {
        Pending_registrations.add(A);
    }
    
    
    @Override
    public Registration get(int i) {
        return Pending_registrations.get(i);
    }

    @Override
    public int get_size(){
        return Pending_registrations.size();
    }
    
    @Override
    public void delete(int i){
        Pending_registrations.remove(i);
    }
}
