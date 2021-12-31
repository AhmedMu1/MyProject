public class Location {
    private String Name;
    private double lat;
    private double lon;

    public Location(String Name, double lat, double lon){
        this.Name = Name;
        this.lat = lat;
        this.lon = lon;
    }

    public void set_Name(String Name){
        this.Name = Name;
    }

    public String get_Name(){
        return Name;
    }

    public void set_lat(double lat){
        this.lat = lat;
    }

    public double get_lat(){
        return lat;
    }

    public void set_lon(double lon){
        this.lon = lon;
    }

    public double get_lon(){
        return lon;
    }
}
