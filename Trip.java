
import java.util.ArrayList;

public class Trip {

    private static String Source;
    private static String Destination;
    private static int Offer;
    private String DName;
    private String CName;
    private long D_mo_no;
    private int rate;

    public static ArrayList<String> Ride = new ArrayList<>();
    public static ArrayList<Trip> rideHistory = new ArrayList<Trip>();
    

    public void add(String Driver_name, String Client_name, int Offer, String Source, long Mobile_Number) {
        setDName(Driver_name);
        setCName(Client_name);
        setOffer(Offer);
        setSource(Source);
        setD_mo_no(Mobile_Number);
    }


    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public long getD_mo_no() {
        return D_mo_no;
    }

    public void setD_mo_no(long D_mo_no) {
        this.D_mo_no = D_mo_no;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public int getOffer() {
        return Offer;
    }

    public void setOffer(int p) {
        Offer = p;
    }

    public void setRate(int r) {
        rate = r;
    }

    public int getRate() {
        return rate;
    }
}
