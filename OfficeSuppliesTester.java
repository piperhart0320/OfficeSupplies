public class OfficeSuppliesTester 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to your office!");

        Stapler myOffice = new Stapler();

        System.out.println("Stapling papers...");

        myOffice.staple(); //staples paper
        myOffice.getAmount(); //checks how many staples are left
        myOffice.staple();
        myOffice.refill(); //refills stapler
        myOffice.staple();
        myOffice.staple();
        myOffice.getAmount();
        System.out.println("");

        PaperShredder Office = new PaperShredder();

        System.out.println("Turning on papershredder..");

        Office.turnOn(); 

        System.out.println("Shredder is turned...(1 is on, 2 is off): " + Office.getStatus());

        System.out.println("Shredding paper...");
        Office.shred();
        Office.shred();

        System.out.println("Checking charge..");
        System.out.println("Your charge is " + Office.getCharge());
        
        System.out.println("Recharging...");
        Office.recharge();
        System.out.println("Your charge is " + Office.getCharge());
        
        System.out.println("Turning off papershredder...");
        Office.turnOff(); 
        System.out.println("Shredder is turned...(1 is on, 2 is off): " + Office.getStatus());

    }
}
