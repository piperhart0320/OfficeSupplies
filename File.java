public class File 
{
    private String color; 
    private int IDnumber;  

    public File(String color, int IDnumber)
    {
        this.IDnumber = IDnumber; 
        this.color = color; 
    }

    public String getColor()
    {
        return color; 
    }
    public int getIDNumber()
    {
        return IDnumber; 
    }
}
