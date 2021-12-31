import java.util.ArrayList;
public class Harvesine extends Trip{
    public static ArrayList<Location> Locations = new ArrayList<Location>();

    public Harvesine(){
        Locations.add(new Location("Cairo",30.0444,31.2357));
        Locations.add(new Location("Giza",30.0131,31.2089));
        Locations.add(new Location("Luxor",25.6872,32.6396));
        Locations.add(new Location("Alexandria",31.2001,29.9187));
        Locations.add(new Location("Aswan",24.0889,32.8998));
        Locations.add(new Location("Hurghada",27.2579,33.8116));
        Locations.add(new Location("Ismailia",30.5965,32.2715));
        Locations.add(new Location("Asyut",27.1783,31.1859));
    }


    public double Calc_distance(String Source, String  Destination) {
        double lat1 = 0, lon1 = 0, lat2 = 0, lon2 = 0;

        for (int i = 0; i < Locations.size(); i++) {
            if(Source.equals(Locations.get(i).get_Name())){
                lat1 = Locations.get(i).get_lat();
                lon1 = Locations.get(i).get_lon();
            }
            else if(Destination.equals(Locations.get(i).get_Name())){
                lat2 = Locations.get(i).get_lat();
                lon2 = Locations.get(i).get_lon();
            }
        }
        double distance = haversine(lat1, lon1, lat2, lon2);
        return distance;
    }


    public static double haversine(double lat1, double lon1, double lat2, double lon2)
    {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
 
        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                   Math.pow(Math.sin(dLon / 2), 2) *
                   Math.cos(lat1) *
                   Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }
}