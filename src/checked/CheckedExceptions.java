/*********************************
Programmer : Anthony D'Ambrosio 
Date       : 11/2/2015
Title      : csm10j-lab10
*********************************/

package checked;
import java.util.*;
import java.io.*;

public class CheckedExceptions
{
    public static void OpenFileChecked() throws FileNotFoundException, IOException
    {
        try
        {
            Scanner inFile = new Scanner(new FileReader("nofile.txt"));
            inFile.close();
        }
        catch(IOException ex)
        {
            throw ex;
        }
    }
}
