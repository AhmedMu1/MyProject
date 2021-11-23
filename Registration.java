public class Registration extends User_Info{
    private String Email;
    private long Mobile_Number;
    public void register(){
        try{
            System.out.print("Name: ");
            Name = input.next();
            System.out.print("Password: ");
            Password = input.next();
            System.out.print("Mobile Number: ");
            Mobile_Number = input.nextLong();
            System.out.println("Email is Optional, do you want to enter it or not:\n1- yes\n2- no");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Email: ");
                    Email = input.next();
                    break;
                case 2:
                    Email = null;
                    break;
                default:
                    throw new Exception("Sorry, you didn't take a valid choice");
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public long getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(int Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }
    
    public void print_Details(){
        System.out.println("Name: " + Name + "\nPassword: " + Password + "\nMobile Number: " + Mobile_Number + "\nEmail: " + Email);
    }
}
