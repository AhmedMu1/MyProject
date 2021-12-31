import java.util.Scanner;

public class Controller {
    Scanner input = new Scanner(System.in);
    Registration CR = new Client_Registration();
    Registration DR = new Driver_Registration();
    Storage DS = new Driver_Storage();
    Storage CS = new Client_Storage();
    Storage AS = new Admin_Storage();
    Login L = new Login();
    Trip T = new Trip();
    Notification CD = new Client_to_Driver();
    Notification DC = new Driver_to_Client();
}
