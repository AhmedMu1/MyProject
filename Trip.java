import java.util.ArrayList;

public abstract class Trip {
    protected String Source_Name;
    protected String Destination_Name;
    protected static ArrayList<String> Source = new ArrayList<String>();

    public abstract void Calc_Distance();
    public abstract void Calc_Time();

    public String getSource_Name() {
        return Source_Name;
    }

    public void setSource_Name(String Source_Name) {
        this.Source_Name = Source_Name;
    }

    public String getDestination_Name() {
        return Destination_Name;
    }

    public void setDestination_Name(String Destination_Name) {
        this.Destination_Name = Destination_Name;
    }

    public int getListSize()
    {
        return Source.size();
    }

    public void getSource(int i)
    {
        System.out.println(Source.get(i));
    }
}
