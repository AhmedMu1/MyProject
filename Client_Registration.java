package testing;
import java.util.ArrayList;

public class Client_Registration  extends Registration{
    @Override
    public void register(String Name, String Password, long Mobile_Number, String Email, String Driver_License, long National_ID) {
        super.register(Name, Password, Mobile_Number, Email,"", 0);
        Client_Storage.Source_Areas.add(new ArrayList<>());
    }
}
