public class Login extends User_Info{
    public boolean Login(Storage s){

        System.out.println("---------------\nLog in:");
        System.out.print("Name: ");
        Name = input.next();
        System.out.print("Password: ");
        Password = input.next();

        for (int i = 0; i < s.get_size(); i++) {
            if (Name.equals(s.getName(i)) && Password.equals(s.getPassword(i))) {
                System.out.println("Log in successfully");
                return true;
            }
        }
        return false;
    }
    public boolean Login(){
        System.out.println("---------------\nLog in:");
        System.out.print("Name: ");
        Name = input.next();
        System.out.print("Password: ");
        Password = input.next();
        if(Name.equals("Admin") && Password.equals("Admin"))
        {
            System.out.println("Login successfully");
            return true;
        }
        else
        {
            System.out.println("Login failed");
            return false;
        }
    }
}
