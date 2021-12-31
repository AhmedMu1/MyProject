public class Admin_Controller extends Controller{
    
    public void List_Registrations(){
        for (int i = 0; i < AS.get_size(); i++) {
            System.out.println("---------------");
            System.out.println(i+1);
            System.out.println("Name: " + AS.get(i).getName());
            System.out.println("Mobile Number: " + AS.get(i).getMobile_Number());
            System.out.println("Email: " + AS.get(i).getEmail());
            System.out.println("Driving License: " + AS.get(i).getDriver_License());
            System.out.println("National ID: " + AS.get(i).getNational_ID());
        }
    }
    public Registration get_obj(int i){
        return AS.get(i);
    }
}

