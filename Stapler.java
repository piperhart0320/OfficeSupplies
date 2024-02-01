public class Stapler 
{

    private int staple_amount;

    public Stapler()
    {      
        staple_amount = 210;
    }

    public int getAmount()
    {
        return staple_amount;
    }

    public void refill()
    {
        staple_amount = 210;

    }

    public void staple()
    {
        if (staple_amount < 0)
        {
            System.out.println("Wuh oh- no more staples!");

        }
        else 
        {
            System.out.println("Staple!");
            staple_amount --;
        }
            
    }
    
}