import java.util.ArrayList;


public class FileCabinet
{
    private ArrayList<File> fileCabinet; 
    private ArrayList<File> redFiles; 
    private ArrayList <File> blueFiles; 
    private ArrayList <File> yellowFiles;
    private ArrayList <File> fileColor; 

    public FileCabinet()
    {
        fileCabinet = new ArrayList <File>(); 
        redFiles = new ArrayList <File> (); 
        yellowFiles = new ArrayList <File> (); 
        blueFiles = new ArrayList <File> (); 
        fileColor = new ArrayList <File> (); 
    }
    public void addFile(File file)
    {
        fileCabinet.add(file); 
    }
    public void removeFile(int pos)
    {
        fileCabinet.remove(pos); 
    }
    public String getFile(int IDnumber)
    {
        String file = ""; 
        for (int i = 0; i < fileCabinet.size(); i++)
        {
            if (fileCabinet.get(i).getIDNumber() == IDnumber)
            {
                file = fileCabinet.get(i).getIDNumber() + ", " + fileCabinet.get(i).getColor(); 
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
            fullList += fileCabinet.get(i).getIDNumber() + ", ";
            fullList += fileCabinet.get(i).getColor() + "\r\n"; 

        }
        return fullList; 
        
    }
    public void addFile(String color, int IDnumber)
    {
        fileCabinet.add(new File(color, IDnumber));
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
        for (int i = 0; i < redFiles.size(); i++) // organize those files back into file cabinet 
        {
            fileColor.add(redFiles.get(i)); 
        }
        for (int i = 0; i < blueFiles.size(); i++)
        {
            fileColor.add(blueFiles.get(i)); 
        }
        for (int i = 0; i < yellowFiles.size(); i++)
        {
            fileColor.add(yellowFiles.get(i)); 
        }

        fileCabinet = fileColor; 
        
    }
    
}
