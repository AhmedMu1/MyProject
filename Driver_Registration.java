package testing;
public class Driver_Registration extends Registration{
    
    @Override
    public void register(String Name, String Password, long Mobile_Number, String Email, String Driver_License, long National_ID) {
        super.register(Name, Password, Mobile_Number, Email, Driver_License, National_ID);
    }
    
}
