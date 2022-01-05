import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!
      public void print10() //Cant make it into a for each loop
      {
        for(int i =0; i<=10;i++)
        {
          System.out.println(dictionary[i]);
        }
      }
      public boolean spellcheck(String word)
    {
      boolean correctSpelling = false;
      for(String w : dictionary)
      {
          if(word.equals(w))
          {
             correctSpelling = true; 
          }
      }
    return correctSpelling;
    }
    public void printStartsWith(String letter)
    {
      for (String l: dictionary)
      {
        if (l.startsWith(letter))
        {
          System.out.println(letter);
        }
      }
      
    }
    

      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }
      
    
   }
