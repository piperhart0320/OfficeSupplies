import java.util.ArrayList;


public class FileCabinet
{
    private ArrayList<File> fileCabinet; 
    private ArrayList<File> redFiles; 
    private ArrayList <File> blueFiles; 
    private ArrayList <File> yellowFiles;

    public FileCabinet()
    {
        fileCabinet = new ArrayList <File>(); 
    }
    public void addFile(File file)
    {
        fileCabinet.add(file); 
    }
    public void removeFile(File file)
    {
        fileCabinet.remove(file); 
    }
    public String getFile(int number)
    {
        String file = ""; 
        for (int i = 0; i < fileCabinet.size(); i++)
        {
            if (fileCabinet.get(i).getNumber() == number)
            {
                file = fileCabinet.get(i).getNumber() + ", " + fileCabinet.get(i).getColor(); 
            }
        }
        return file; 
    }
    public String fullCabinet()
    {
        String fullList = "";
        for (int i = 0; i < fileCabinet.size(); i++)
        {
            fullList += "File number "; 
            fullList += fileCabinet.get(i).getNumber() + ", ";
            fullList += fileCabinet.get(i).getColor() + "\r\n"; 

        }
        return fullList; 
        
    }
    public void addFile(String color, int number)
    {
        fileCabinet.add(new File(number, color));
    }
    public void organizeByRainbow()
    {
        for (int i = 0; i < fileCabinet.size(); i++)        // organize files into separate files by color
        {
            if (fileCabinet.get(i).getColor().equals("red"))
            {
                redFiles.add(fileCabinet.get(i)); 
            }
            else if (fileCabinet.get(i).getColor().equals("blue"))
            {
                blueFiles.add(fileCabinet.get(i));
            }
            else 
            {
                yellowFiles.add(fileCabinet.get(i)); 
            }
        }
        for (int i = 0; i < redFiles.size(); i++) // organize those files back into fi
        {

        }
    }
        

    
}
