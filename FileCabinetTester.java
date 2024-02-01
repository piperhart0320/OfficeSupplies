public class FileCabinetTester 
{
    public static void main(String [] args)
    {
        System.out.println("making a file cabinet"); 
        FileCabinet myfile = new FileCabinet(); 
        
        System.out.println("adding files...");
        myfile.addFile("red", 12); 
        myfile.addFile("yellow", 2); 
        myfile.addFile("yellow", 34); 
        myfile.addFile("blue", 54); 
        myfile.addFile("red", 23); 

        System.out.println("printing the cabinet"); 
        System.out.println(myfile.fullCabinet()); 

        System.out.println("adding blue file, ID #45");
        myfile.addFile("blue", 45); 

        System.out.println("printing updated cabinet"); 
        System.out.println(myfile.fullCabinet()); 

        System.out.println("removing file in position 3"); 
        myfile.removeFile(3); 

        System.out.println("printing updated cabinet"); 
        System.out.println(myfile.fullCabinet()); 

        System.out.println("printing file with ID number 12..."); 
        System.out.println(myfile.getFile(12)); 

        System.out.println("oranizing file by colors (red, blue, yellow)...");
        myfile.organizeByRainbow(); 

        System.out.println("printing updated list..."); 
        System.out.println(myfile.fullCabinet()); 
        

    }
}
