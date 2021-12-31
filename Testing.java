import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Choose:\n1-Client\n2-Driver\n3-Admin");
            int person = input.nextInt();
            switch (person) {
                case 1:
                    Client_UI c = new Client_UI();
                    System.out.println("-------------------------------------\nChoose:\n1-Registeration\n2-Login");
                    int Cchoice = input.nextInt();
                    switch (Cchoice) {
                        case 1:
                            System.out.println("Please, Enter your Name, Password, Mobile_Number, Email:");
                            String CName = input.next();
                            String CPassword = input.next();
                            long CMobile_Number = input.nextLong();
                            String CEmail = input.next();
                            c.C_Registration(CName, CPassword, CMobile_Number, CEmail);
                            break;
                        case 2:
                            System.out.println("Please, Enter your Name, Password");
                            String Username = input.next();
                            String Pass = input.next();
                            if (c.Log_in(Username, Pass)) {
                                System.out.println("Choose an Option:\n1-Request Ride\n2-List Ride Offers\n3- Rate previous ride\n4-Log Out");
                                int o = input.nextInt();
                                switch (o) {
                                    case 1:
                                        c.Set_Ride(Username);
                                        break;
                                    case 2:
                                        c.printDriver(Username);
                                        System.out.println("--------------------\nTo choose a driver, choose a name");
                                        String dname = input.next();
                                        c.SelectDriver(Username, dname);
                                        break;
                                    case 3:
                                        c.Rate(Username);
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.err.println("Invalid Choice");
                                }
                            }
                            break;
                        default:
                            System.err.println("Invalid Choice");
                    }
                    break;
                case 2:
                    Driver_UI D = new Driver_UI();
                    System.out.println("-------------------------------------\nChoose:\n1-Registeration\n2-Login");
                    int d = input.nextInt();
                    switch (d) {
                        case 1:
                            System.out.println("Please, Enter your Name, Password, Mobile_Number, Email, Driving License and National Id:");
                            String DName = input.next();
                            String DPassword = input.next();
                            Long DMobile_Number = input.nextLong();
                            String DEmail = input.next();
                            String DLicense = input.next();
                            long DNational_ID = input.nextLong();
                            D.D_Registration(DName, DPassword, DMobile_Number, DEmail, DLicense, DNational_ID);
                            break;
                        case 2:
                            System.out.println("Please, Enter your Name, Password");
                            String Username = input.next();
                            String Pass = input.next();
                            if(D.Log_in(Username, Pass)){
                            System.out.println("Choose an Option:\n1-Add Favourite Area\n2-Show Rides\n3-Offers Notification\n4- End Ride\n5- Print your balance\n6-Log out");
                            int Dchoice = input.nextInt();
                            switch (Dchoice) {
                                case 1:
                                    System.out.print("How many Areas do you want to add? ");
                                    int areas = input.nextInt();
                                    for (int i = 0; i < areas; i++) {
                                        String Area = input.next();
                                        D.Add_Fav_Area(Username, Area);
                                    }
                                    break;
                                case 2:
                                    D.printClient(Username);
                                    System.out.println("If you want to select a ride choose a Name and put an offer else type 0");
                                    String CName = input.next();
                                    if (CName.equalsIgnoreCase("0"))
                                        break;
                                    int offer = input.nextInt();
                                    D.select_ride(Username, CName, offer);
                                    break;
                                case 3:
                                    D.showNotification(Username);
                                    break;
                                case 4:
                                    D.endRide(Username);
                                    break;
                                case 5:
                                    System.out.println(D.getBalance(Username)); 
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.err.println("Invalid Choice");
                                    break;
                            }
                            }
                            break;
                        default:
                            System.err.println("Invalid Choice");
                    }
                    break;
                case 3:
                    Admin_UI A = new Admin_UI();
                    System.out.println("Please, Enter your Name, Password");
                    String Username = input.next();
                    String Pass = input.next();
                    if(A.Log_in(Username, Pass)) {
                        A.Verify_Registration();
                        break;
                    }
                default:
                    System.err.println("Invalid Choice");
            }

        } while (true);

    }

}
