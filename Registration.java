public abstract class Registration extends User_Info{
    private String Email;
    private long Mobile_Number;
    private String Driver_License;
    private long National_ID;
    public void register(String Name, String Password, long Mobile_Number, String Email, String Driver_License, long National_ID){
        setName(Name);
        setPassword(Password);
        this.Email = Email;
        this.Mobile_Number = Mobile_Number;
        this.Driver_License = Driver_License;
        this.National_ID = National_ID;
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

    public void setMobile_Number(long Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
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
