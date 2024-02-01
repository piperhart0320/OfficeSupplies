public class PaperShredder
{
    private int status; 
    private int charge; 

    public PaperShredder()
    {
        status = 0; 
        charge = 100; 
    }
    public int getCharge()
    {
        return charge; 
    }
    public void shred()
    {
        charge = charge - 10; 
    }
    public void recharge()
    {
        charge = 100; 
    }
    public void turnOn()
    {
        status = 1; 
    }
    public void turnOff()
    {
        status = 0; 
    }
    public int getStatus()
    {
        return status; 
    }
}