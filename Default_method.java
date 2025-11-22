interface  Camera
{
    void takeSnap();
    void recordVideo();
}
interface wifi
{
    String [] getNtworks();
    void connectToNetwork(String network);
}
class MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("calling.. " + phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
    // void takeSnap()
    // {
    //     System.out.println("Taking Snap...");
    // }
}

class MySmartPhone extends MyCellPhone implements wifi,Camera
{
    public void takeSnap()
    {
        System.out.println("Taking Snap...");
    }
    public void recordVideo()
    {
        System.out.println("Recording video...");
    }

    public String[] getNtworks()
    {
        System.out.println("Getting available networks...");
        String[] networks = {"Network1", "Network2", "Network3"};
        return networks;
    }

    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to " + network + "...");
    }
}

public class Default_method {
    public static void main(String[] args) {
        
    }
}
