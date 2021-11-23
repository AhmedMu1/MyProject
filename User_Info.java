import java.util.Scanner;

public class User_Info {
    protected String Name;
    protected String Password;
    Scanner input = new Scanner(System.in);
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
