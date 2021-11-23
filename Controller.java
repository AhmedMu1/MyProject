import java.util.Scanner;

public abstract class Controller {
    Scanner input = new Scanner(System.in);
    Storage storage;
    protected Trip t;
    Notification n;

    public void getDriver(int driver)
    {
        storage = new Driver_Storage();
        storage.get(driver);
    }

    public void getClient(int client)
    {
        storage = new Driver_Storage();
        storage.get(client);
    }

    public boolean getFvAreaDriver(String Area)
    {
        Driver_Storage storage = new Driver_Storage();
        for (int i = 0; i < storage.get_size(); i++) {
            for (int j = 0; j < storage.getFvAreasSize(i); j++) {
                if(Area.equals(storage.getFvAreas(i,j)))
                {
                    getDriver(i);
                    return true;
                }
            }
        }
        return false;
    }
}
