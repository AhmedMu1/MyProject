package testing;
import java.util.ArrayList;

public class Admin_UI extends Admin_Controller {


    public void Verify_Registration() {
        List_Registrations();
        boolean flag = true;
        do {
            System.out.println("To verify any account, choose a number and if not type 0");
            int n = input.nextInt();
            if(n == 0) flag = false;
            else{
                DS.Add(get_obj(n-1));
                Driver_Storage.Favourite_Areas.add(new ArrayList());
                AS.delete(n-1);
            }
        } while (flag);
    }
    public void Log_in(String Name, String Password){
        if(Name.equals("Admin") && Password.equals("Admin"))
            System.out.println("Login Succesful");
        else
            System.out.println("Login Fail");
    }
}
