import java.util.ArrayList;

public class Admin_UI extends Admin_Controller {


    public void Verify_Registration() {
        List_Registrations();
        boolean flag = true;
        do {
            System.out.println("-------------------------------------\nTo verify any account, choose a number and if not type 0");
            int n = input.nextInt();
            if(n == 0) flag = false;
            else{
                DS.Add(get_obj(n-1));
                Driver_Storage.Favourite_Areas.add(new ArrayList());
                Driver_Storage.driverBalance.add(0);
                AS.delete(n-1);
            }
        } while (flag);
    }
    public boolean Log_in(String Name, String Password){
        if(Name.equals("Admin") && Password.equals("Admin")) {
            System.out.println("Login Succesful");
            return true;
        }
        else {
            System.out.println("Login Fail");
            return false;
        }
    }
}
