public class Driver_Registration extends Registration{
    private String Driver_License;
    private long National_ID;
    
    
    @Override
    public void register() {
        super.register();
        System.out.print("Driver License: ");
        Driver_License = input.next();
        System.out.print("National ID: ");
        National_ID = input.nextLong();
    }
    @Override
    public void print_Details(){
        System.out.println("-------------");
        System.out.println("Driver Details"); 
        super.print_Details();
        System.out.println("Driver License: " + Driver_License + "\nNational ID: " + National_ID );
    }
    public String getDriver_License() {
        return Driver_License;
    }

    public void setDriver_License(String Driver_License) {
        this.Driver_License = Driver_License;
    }

    public long getNational_ID() {
        return National_ID;
    }

    public void setNational_ID(int National_ID) {
        this.National_ID = National_ID;
    }
    
}
