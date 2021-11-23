import java.util.ArrayList;
import java.util.Scanner;


public class SA_Sprint1 {
    public static void main(String[] args) {
        int user;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose one from below:\n1- Admin\n2- Client\n3- Driver\n4- Exit");
            user = input.nextInt();
            try {
                switch (user) {
                    case 1:
                        Login Admin_Login = new Login();
                        if(Admin_Login.Login()) {
                            Admin_Controller ac = new Admin_Controller();
                            ac.Verify_Registration();
                        }
                        break;
                    case 2:
                        Storage c = new Client_Storage();
                        Login client_login = new Login();
                        System.out.println("Choose one from below:\n1- Register\n2- Login");
                        int client_choice = input.nextInt();
                        switch (client_choice) {
                            case 1:
                                Registration C1 = new Client_Registration();
                                C1.register();
                                c.Add(C1);
                            case 2:
                                if(client_login.Login(c))
                                {
                                    Client_Controller cc = new Client_Controller();
                                    cc.Request_Ride();
                                }
                                break;
                            default:
                                throw new Exception("Sorry, you didn't take a valid choice");
                        }
                        break;
                    case 3:
                        Login Driver_login = new Login();
                        Storage d = new Driver_Storage();
                        Driver_Storage ds = new Driver_Storage();
                        Driver_Controller dc = new Driver_Controller();
                        System.out.println("Choose one from below:\n1- Register\n2- Login");
                        int Driver_choice = input.nextInt();
                        switch (Driver_choice) {
                            case 1:
                                Registration D1 = new Driver_Registration();
                                D1.register();
                                Storage AS = new Admin_Storage();
                                AS.Add(D1);
                                Admin_Controller AC = new Admin_Controller();
                                AC.Verify_Registration();
                            case 2:
                                if(Driver_login.Login(d)) {
                                    ArrayList<String> Fv_Areas = new ArrayList<>();
                                    int choice;
                                    do {
                                        System.out.print("Please enter your favourite area: ");
                                        String FvArea = input.next();
                                        Fv_Areas.add(FvArea);
                                        System.out.println("Press 1 if you want to add more\nPress any button if you want to exit");
                                        choice = input.nextInt();
                                    } while (choice == 1);
                                    ds.addFvAreas(Fv_Areas);
                                    dc.ListAllRides();
                                }

                                break;
                            default:
                                throw new Exception("Sorry, you didn't take a valid choice");
                        }
                        break;
                    case 4:
                        break;
                    default:
                        throw new Exception("Sorry, you didn't take a valid choice");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }while(user == 4);
    }
}
