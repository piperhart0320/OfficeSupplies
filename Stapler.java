public class Stapler 
{

    private int staple_amount;
    

    public Stapler()
    {      
        staple_amount = 210;
    }

    public void getAmount()
    {
        System.out.println("You have " + staple_amount + " left.");
    }

    public void refill()
    {
        System.out.println("You have refilled the stapler! 210 staplers ready.");
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