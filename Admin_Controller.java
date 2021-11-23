public class Admin_Controller extends Controller{
    public void Verify_Registration(){
        System.out.println("----------------");
        System.out.println("Listing all pending registrations");
        System.out.println("----------------");
        Registration d = new Driver_Registration();
        Storage as = new Admin_Storage();
        Storage DS  = new Driver_Storage();
        for (int i = 0; i < as.get_size(); i++) {
            List_Pending_Registrations(as, "ListSpecify", i);
            System.out.println("----------------\n1- Accept\n2- Deny");
            int v = input.nextInt();
            switch(v){
                case 1:
                    DS.Add(d);
                    break;
                case 2:
                    System.out.println("Registration Failed");
                    break;
                default:
                    System.out.println("Choice Failed");
            }
        }
        if(as.get_size() == 0)
        {
            System.out.println("There is no pending registrations available");
        }
    }
    public void List_Pending_Registrations(Storage as, String choice, int s){
        if("Listall".equals(choice)){
            for (int i = 0; i < as.get_size(); i++) {
                as.get(i);
            }
        }
        else if("ListSpecify".equals(choice)){
            as.get(s);
        }
    }
}

